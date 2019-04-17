package com.inmemory.gleifparser.service;

import static com.inmemory.gleifparser.constants.Constants.SAVE_RECORDS_BATCH_SIZE;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inmemory.gleifparser.beans.BaseBean;
import com.inmemory.gleifparser.beans.StatusUpdateResponseBean;
import com.inmemory.gleifparser.constants.Constants;
import com.inmemory.gleifparser.constants.XmlDataConstants;
import com.inmemory.gleifparser.dao.GleifHeaderDAO;
import com.inmemory.gleifparser.dao.Level1LeiRecordDao;
import com.inmemory.gleifparser.entity.GleifHeader;
import com.inmemory.gleifparser.entity.Level1LeiRecord;
import com.inmemory.gleifparser.mappers.HeaderMapper;
import com.inmemory.gleifparser.mappers.LeiOneXmlDbMapper;
import com.inmemory.gleifparser.model.level1.LEIHeaderType;
import com.inmemory.gleifparser.model.level1.LEIRecordType;
import com.inmemory.gleifparser.utils.GleifXmlUnmarshallerFactory;

@Service
@Transactional
public class Level1LeiServiceImpl extends StatusAndTaskUpdaterService implements Level1LeiService {

	@Autowired
	private Level1LeiRecordDao level1LeiRecordDao;
	@Autowired
	private GleifHeaderDAO gleifHeaderDAO;

	@Override
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader, String subscriberId) throws Exception {
		LEIHeaderType leiHeader = null;
		if (xmlEventReader != null) {
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement()) {
					if (XmlDataConstants.LEVEL_1_LEI_HEADER_ROOT
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						leiHeader = GleifXmlUnmarshallerFactory.getLeiXmlUnmarshaller()
								.unmarshal(xmlEventReader, LEIHeaderType.class).getValue();
					} else if (XmlDataConstants.LEVEL_1_LEI_RECORDS_ROOT
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						parseLeiRecords(xmlEventReader, leiHeader, subscriberId);
						break;
					}
				}
				xmlEventReader.nextEvent();

			}
		}

	}

	private void parseLeiRecords(XMLEventReader xmlEventReader, LEIHeaderType leiHeader, String subscriberId)
			throws Exception {
		List<Level1LeiRecord> leiRecords = new ArrayList<Level1LeiRecord>();
		GleifHeader oldRecord = gleifHeaderDAO.findByFileContent(XmlDataConstants.FILE_TYPE_LEVEL1_LEI);

		Level1LeiRecord curRecord = null;
		GleifHeader gleifHeader = HeaderMapper.convertLeiHeaderToEntity(leiHeader);
		StatusUpdateResponseBean statusUpdateResponseBean = new StatusUpdateResponseBean();
		statusUpdateResponseBean.setTotalNumberOfRecords(gleifHeader.getRecordCount());
		statusUpdateResponseBean.setNumberOfProcessedRecords(0);
		statusUpdateResponseBean.setStatus(Constants.STATUS_IN_PROGRESS);

		// if it is not a complete file then ignore
		if (!XmlDataConstants.FILE_CONTENT_FULL_PUBLISHED.equalsIgnoreCase(leiHeader.getFileContent().value())) {
			statusUpdateResponseBean.setError(true);
			statusUpdateResponseBean.setStatus(Constants.STATUS_FAILED);
			statusUpdateResponseBean.setMessage(Constants.ONLY_FULL_PUBLISHED_FILES_ARE_SUPPORTED);
			return;
		}
		if (oldRecord != null) {
			gleifHeaderDAO.delete(oldRecord);
		}
		statusUpdateResponseBean.setMessage(Constants.DELETE_OLD_RECORDS);
		sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
		level1LeiRecordDao.deleteAll();
		List<Future<BaseBean>> runningTasks = new ArrayList<>();
		List<Future<BaseBean>> completedTasks = new ArrayList<>();
		boolean isError = false;
		try {

			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement() && XmlDataConstants.LEVEL_1_LEI_RECORD_ROOT
						.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
					LEIRecordType leiRecord = GleifXmlUnmarshallerFactory.getLeiXmlUnmarshaller()
							.unmarshal(xmlEventReader, LEIRecordType.class).getValue();
					curRecord = LeiOneXmlDbMapper.convertFromXmlToEntityObject(leiRecord);
					leiRecords.add(curRecord);
					// write in batches
					if (leiRecords.size() >= SAVE_RECORDS_BATCH_SIZE) {
						runningTasks.add(saveEntities(new ArrayList<>(leiRecords)));
						isError = checkAndUpdateRunningTasks(statusUpdateResponseBean, runningTasks, completedTasks);
						leiRecords.clear();
						if (isError) {
							break;
						} else {
							sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
						}
					}
				}
				xmlEventReader.nextEvent();
			}
			if (!leiRecords.isEmpty()) {
				level1LeiRecordDao.saveAll(leiRecords);
				level1LeiRecordDao.flush();
				statusUpdateResponseBean.setNumberOfProcessedRecords(
						statusUpdateResponseBean.getNumberOfProcessedRecords() + leiRecords.size());
			}
			// do until completed tasks is zero
			long currentProcessedCount = statusUpdateResponseBean.getNumberOfProcessedRecords();
			while (!runningTasks.isEmpty()) {
				isError = checkAndUpdateRunningTasks(statusUpdateResponseBean, runningTasks, completedTasks);
				if (isError || currentProcessedCount < statusUpdateResponseBean.getNumberOfProcessedRecords()) {
					sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
					currentProcessedCount = statusUpdateResponseBean.getNumberOfProcessedRecords();
				}
			}
			if (!isError) {
				// delete old records
				statusUpdateResponseBean.setStatus(Constants.STATUS_COMPLETE);
				sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
			}
		} catch (JAXBException | XMLStreamException | InterruptedException | ExecutionException
				| DataAccessException ex) {
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

	@Async
	private Future<BaseBean> saveEntities(List<Level1LeiRecord> leiRecords) {
		BaseBean baseBean = new BaseBean();
		try {
			level1LeiRecordDao.saveAll(leiRecords);
			level1LeiRecordDao.flush();
		} catch (Exception ex) {
			baseBean.setError(true);
			baseBean.setMessage(ex.getMessage());
		}

		return new AsyncResult<BaseBean>(baseBean);
	}

}
