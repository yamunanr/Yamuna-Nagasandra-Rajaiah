package com.inmemory.gleifparser.service;

import static com.inmemory.gleifparser.constants.Constants.SAVE_RECORDS_BATCH_SIZE;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import javax.xml.stream.XMLEventReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inmemory.gleifparser.beans.BaseBean;
import com.inmemory.gleifparser.beans.Level2ExceptionRangeBean;
import com.inmemory.gleifparser.beans.StatusUpdateResponseBean;
import com.inmemory.gleifparser.constants.Constants;
import com.inmemory.gleifparser.constants.XmlDataConstants;
import com.inmemory.gleifparser.dao.GleifHeaderDAO;
import com.inmemory.gleifparser.dao.Level2ExceptionReasonDao;
import com.inmemory.gleifparser.dao.Level2ExceptionReferenceDAO;
import com.inmemory.gleifparser.dao.Level2ReportingExceptionDAO;
import com.inmemory.gleifparser.entity.GleifHeader;
import com.inmemory.gleifparser.entity.Level2ReportingException;
import com.inmemory.gleifparser.mappers.HeaderMapper;
import com.inmemory.gleifparser.mappers.Level2RepExceptionDbMapper;
import com.inmemory.gleifparser.model.level2_rex.ExceptionHeaderType;
import com.inmemory.gleifparser.model.level2_rex.ExceptionType;
import com.inmemory.gleifparser.utils.GleifXmlUnmarshallerFactory;

@Service
@Transactional
public class ReportingExceptionServiceImpl extends StatusAndTaskUpdaterService implements ReportingExceptionService {
	@Autowired
	private Level2ReportingExceptionDAO reportingExceptionDAO;

	@Autowired
	private Level2ExceptionReasonDao exceptionReasonDao;

	@Autowired
	private Level2ExceptionReferenceDAO exceptionReferenceDAO;

	@Autowired
	private GleifHeaderDAO gleifHeaderDAO;

	@Autowired
	private AsyncSaverServiceImpl asyncSaverServiceImpl;

	private Logger logger = LoggerFactory.getLogger(ReportingExceptionServiceImpl.class);

	@Override
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader, String subscriberId)
			throws Exception {
		if (xmlEventReader != null) {
			ExceptionHeaderType header=null;
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement()) {
					if (XmlDataConstants.LEVEL_2_REPORTING_EXCEPTION_HEADER
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						header = GleifXmlUnmarshallerFactory
								.getReportingExceptionsJaxbUnmarshaller()
								.unmarshal(xmlEventReader, ExceptionHeaderType.class).getValue();
					} else if (XmlDataConstants.LEVEL_2_REPORTING_EXCEPTION_RECORDS
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						parseReportingExceptionRecords(xmlEventReader, subscriberId,header);
						break;
					}
				}
				xmlEventReader.nextEvent();

			}

		}

	}

	
	private void parseReportingExceptionRecords(XMLEventReader xmlEventReader, String subscriberId, ExceptionHeaderType header)
			throws Exception {
	
		List<Level2ReportingException> level2relationshiprecords = new ArrayList<>();
		Level2ReportingException curRecord = null;

		List<Future<BaseBean>> runningTasks = new ArrayList<>();
		List<Future<BaseBean>> completedTasks = new ArrayList<>();
		GleifHeader oldHeader = gleifHeaderDAO.findByFileContent(XmlDataConstants.FILE_TYPE_LEVEL2_REP_EXCEPTION);
		GleifHeader newHeader = HeaderMapper.convertRepExceptionHeaderToEntity(header);
		StatusUpdateResponseBean statusUpdateResponseBean = initializeStatusResponseBean(newHeader);
		boolean isError = false;
		Level2ExceptionRangeBean curRangeBean = null;
		try {
			// before inserting find current records primary key ranges so it can be deleted
			curRangeBean = findMinMaxRanges();
			// if it is not a complete file then ignore
			if (!XmlDataConstants.FILE_CONTENT_FULL_PUBLISHED.equalsIgnoreCase(header.getFileContent().value())) {
				sendFailedStatus(subscriberId, Constants.ONLY_FULL_PUBLISHED_FILES_ARE_SUPPORTED,
						statusUpdateResponseBean);
				return;
			}
			
			long currentProcessedCount = 0;
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement() && XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORD
						.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
					ExceptionType relationshipRecord = GleifXmlUnmarshallerFactory
							.getReportingExceptionsJaxbUnmarshaller().unmarshal(xmlEventReader, ExceptionType.class)
							.getValue();
					curRecord = Level2RepExceptionDbMapper.convertFromXmlToEntityObject(relationshipRecord);
					level2relationshiprecords.add(curRecord);
					// write in batches
					if (level2relationshiprecords.size() >= SAVE_RECORDS_BATCH_SIZE) {
						runningTasks
								.add(asyncSaverServiceImpl.saveRecExEntities(new ArrayList<>(level2relationshiprecords)));
						isError = checkAndUpdateRunningTasks(statusUpdateResponseBean, runningTasks, completedTasks);
						if (currentProcessedCount < statusUpdateResponseBean.getNumberOfProcessedRecords()) {
							sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
							currentProcessedCount = statusUpdateResponseBean.getNumberOfProcessedRecords();
						}
						level2relationshiprecords.clear();
						if (isError) {
							break;
						}
					}
				} else {
					xmlEventReader.nextEvent();
				}

			}
			if (!level2relationshiprecords.isEmpty()) {
				reportingExceptionDAO.saveAll(level2relationshiprecords);
				reportingExceptionDAO.flush();
				statusUpdateResponseBean.setNumberOfProcessedRecords(
						statusUpdateResponseBean.getNumberOfProcessedRecords() + level2relationshiprecords.size());
			}

			// do until completed tasks is zero

			while (!runningTasks.isEmpty()) {
				isError = checkAndUpdateRunningTasks(statusUpdateResponseBean, runningTasks, completedTasks);
				if (isError || currentProcessedCount < statusUpdateResponseBean.getNumberOfProcessedRecords()) {
					sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
					currentProcessedCount = statusUpdateResponseBean.getNumberOfProcessedRecords();
				}
			}
			if (!isError) {
				statusUpdateResponseBean.setStatus(Constants.STATUS_COMPLETE);
				// delete old records
				deleteOldRecords(curRangeBean, oldHeader);
				sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
				// insert new header
				gleifHeaderDAO.save(newHeader);
			} else {
				// delete newly inserted records
				deletenewlyInsertedRecords(curRangeBean);
				sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
			}

		} catch (Exception ex) {
			if (curRangeBean != null) {
				deletenewlyInsertedRecords(curRangeBean);
			}
			for (Future<BaseBean> taskStatusResponse : runningTasks) {
				if (!taskStatusResponse.isDone()) {
					taskStatusResponse.cancel(true);
				}
			}
			statusUpdateResponseBean.setError(true);
			statusUpdateResponseBean.setStatus(Constants.STATUS_FAILED);
			statusUpdateResponseBean.setMessage(ex.getMessage());
			sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
			throw ex;
		}
	}
	
	
	
	
	
	
	
	
	

	private Level2ExceptionRangeBean findMinMaxRanges() {
		Level2ExceptionRangeBean curRangeBean = new Level2ExceptionRangeBean();
		curRangeBean.setMinExceptionId(reportingExceptionDAO.findMinId());
		curRangeBean.setMaxExceptionId(reportingExceptionDAO.findMaxId());
		curRangeBean.setMinReasonId(exceptionReasonDao.findMinId());
		curRangeBean.setMaxReasonId(exceptionReasonDao.findMaxId());
		curRangeBean.setMinExReferenceId(exceptionReferenceDAO.findMinId());
		curRangeBean.setMaxExReferenceId(exceptionReferenceDAO.findMaxId());
		return curRangeBean;
	}

	private void deleteOldRecords(Level2ExceptionRangeBean curRangeBean, GleifHeader oldRecord) {
		if (curRangeBean.getMinExReferenceId() != null) {
			exceptionReferenceDAO.deleteAllRecordsInRange(curRangeBean.getMinExReferenceId(),
					curRangeBean.getMaxExReferenceId());
		}
		if (curRangeBean.getMinReasonId() != null) {
			exceptionReasonDao.deleteAllRecordsInRange(curRangeBean.getMinReasonId(), curRangeBean.getMaxReasonId());
		}
		if (curRangeBean.getMinExceptionId() != null) {
			reportingExceptionDAO.deleteAllRecordsInRange(curRangeBean.getMinExceptionId(),
					curRangeBean.getMaxExceptionId());
		}
		if (oldRecord != null) {
			gleifHeaderDAO.delete(oldRecord);
		}
	}

	private void deletenewlyInsertedRecords(Level2ExceptionRangeBean curRangeBean) {
		if (curRangeBean.getMaxExReferenceId() != null) {
			exceptionReferenceDAO.deleteRecordKeyGreaterThan(curRangeBean.getMaxExReferenceId());
		} else {
			exceptionReferenceDAO.deleteRecordKeyGreaterThan(0L);
		}
		if (curRangeBean.getMaxReasonId() != null) {
			exceptionReasonDao.deleteRecordKeyGreaterThan(curRangeBean.getMaxReasonId());
		} else {
			exceptionReasonDao.deleteRecordKeyGreaterThan(0L);
		}
		if (curRangeBean.getMaxExceptionId() != null) {
			reportingExceptionDAO.deleteRecordKeyGreaterThan(curRangeBean.getMaxExceptionId());
		} else {
			reportingExceptionDAO.deleteRecordKeyGreaterThan(0L);
		}
	}

}
