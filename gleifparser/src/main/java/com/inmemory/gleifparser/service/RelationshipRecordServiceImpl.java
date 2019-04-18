package com.inmemory.gleifparser.service;

import static com.inmemory.gleifparser.constants.Constants.SAVE_RECORDS_BATCH_SIZE;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import javax.xml.stream.XMLEventReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inmemory.gleifparser.beans.BaseBean;
import com.inmemory.gleifparser.beans.Level2RRCurRangeBean;
import com.inmemory.gleifparser.beans.StatusUpdateResponseBean;
import com.inmemory.gleifparser.constants.Constants;
import com.inmemory.gleifparser.constants.XmlDataConstants;
import com.inmemory.gleifparser.dao.GleifHeaderDAO;
import com.inmemory.gleifparser.dao.Level2RRQualifierDAO;
import com.inmemory.gleifparser.dao.Level2RrQuantifierDAO;
import com.inmemory.gleifparser.dao.LevelTwoRRDao;
import com.inmemory.gleifparser.entity.GleifHeader;
import com.inmemory.gleifparser.entity.Level2RelationshipRecord;
import com.inmemory.gleifparser.mappers.HeaderMapper;
import com.inmemory.gleifparser.mappers.Level2RrXmlDbMapper;
import com.inmemory.gleifparser.model.level2_rr.RRHeaderType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipRecordType;
import com.inmemory.gleifparser.utils.GleifXmlUnmarshallerFactory;

@Service
@Transactional
public class RelationshipRecordServiceImpl extends StatusAndTaskUpdaterService implements RelationshipRecordService {

	@Autowired
	private AsyncSaverServiceImpl asyncSaverServiceImpl;
	@Autowired
	private LevelTwoRRDao levelTwoRRDao;
	@Autowired
	private Level2RRQualifierDAO qualifierDAO;

	@Autowired
	private Level2RrQuantifierDAO quantifierDAO;

	@Autowired
	private GleifHeaderDAO gleifHeaderDAO;

	@Override
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader, String subscriberId) throws Exception {

		if (xmlEventReader != null) {
			RRHeaderType rrHeader = null;
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement()) {

					if (XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORD_HEADER
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						rrHeader = GleifXmlUnmarshallerFactory.getRelationshipRecordUnmarshaller()
								.unmarshal(xmlEventReader, RRHeaderType.class).getValue();

					} else if (XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORDS
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						parseRelationshipRecords(xmlEventReader, rrHeader, subscriberId);
						break;
					}
				}
				xmlEventReader.nextEvent();

			}

		}

	}
	
	
	private void parseRelationshipRecords(XMLEventReader xmlEventReader, RRHeaderType rrHeader, String subscriberId)
			throws Exception {
		List<Level2RelationshipRecord> level2relationshiprecords = new ArrayList<>();
		Level2RelationshipRecord curRecord = null;

		List<Future<BaseBean>> runningTasks = new ArrayList<>();
		List<Future<BaseBean>> completedTasks = new ArrayList<>();
		GleifHeader oldHeader = gleifHeaderDAO.findByFileContent(XmlDataConstants.FILE_TYPE_LEVEL2_RR);
		GleifHeader newHeader = HeaderMapper.convertRRHeaderToEntity(rrHeader);
		StatusUpdateResponseBean statusUpdateResponseBean = initializeStatusResponseBean(newHeader);
		boolean isError = false;
		Level2RRCurRangeBean curRangeBean = null;
		try {
			// before inserting find current records primary key ranges so it can be deleted
			curRangeBean = findLevel2MinMaxRanges();
			// if it is not a complete file then ignore
			if (!XmlDataConstants.FILE_CONTENT_FULL_PUBLISHED.equalsIgnoreCase(rrHeader.getFileContent().value())) {
				sendFailedStatus(subscriberId, Constants.ONLY_FULL_PUBLISHED_FILES_ARE_SUPPORTED,
						statusUpdateResponseBean);
				return;
			}
			
			long currentProcessedCount = 0;
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement() && XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORD
						.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
					RelationshipRecordType relationshipRecord = GleifXmlUnmarshallerFactory
							.getRelationshipRecordUnmarshaller().unmarshal(xmlEventReader, RelationshipRecordType.class)
							.getValue();
					curRecord = Level2RrXmlDbMapper.convertFromXmlToEntityObject(relationshipRecord);
					level2relationshiprecords.add(curRecord);
					// write in batches
					if (level2relationshiprecords.size() >= SAVE_RECORDS_BATCH_SIZE) {
						runningTasks
								.add(asyncSaverServiceImpl.saveRREntities(new ArrayList<>(level2relationshiprecords)));
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
				levelTwoRRDao.saveAll(level2relationshiprecords);
				levelTwoRRDao.flush();
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

	private Level2RRCurRangeBean findLevel2MinMaxRanges() {
		Level2RRCurRangeBean curRangeBean = new Level2RRCurRangeBean();
		curRangeBean.setMinRRId(levelTwoRRDao.findMinId());
		curRangeBean.setMaxRRId(levelTwoRRDao.findMaxId());
		curRangeBean.setMinQualifierId(qualifierDAO.findMinId());
		curRangeBean.setMaxQualifierId(qualifierDAO.findMaxId());
		curRangeBean.setMinQuantifierId(quantifierDAO.findMinId());
		curRangeBean.setMaxQuantifierId(quantifierDAO.findMaxId());
		return curRangeBean;
	}

	private void deleteOldRecords(Level2RRCurRangeBean curRangeBean, GleifHeader oldRecord) {
		if (curRangeBean.getMinQualifierId() != null) {
			qualifierDAO.deleteAllRecordsInRange(curRangeBean.getMinQualifierId(), curRangeBean.getMaxQualifierId());
		}
		if (curRangeBean.getMinQuantifierId() != null) {
			quantifierDAO.deleteAllRecordsInRange(curRangeBean.getMinQuantifierId(), curRangeBean.getMaxQuantifierId());
		}
		if (curRangeBean.getMinRRId() != null) {
			levelTwoRRDao.deleteAllRecordsInRange(curRangeBean.getMinRRId(), curRangeBean.getMaxRRId());
		}
		if (oldRecord != null) {
			gleifHeaderDAO.delete(oldRecord);
		}
	}

	private void deletenewlyInsertedRecords(Level2RRCurRangeBean curRangeBean) {
		if (curRangeBean.getMaxQualifierId() != null) {
			qualifierDAO.deleteRecordKeyGreaterThan(curRangeBean.getMaxQualifierId());
		}else {
			qualifierDAO.deleteRecordKeyGreaterThan(0L);
		}
		if (curRangeBean.getMaxQuantifierId() != null) {
			quantifierDAO.deleteRecordKeyGreaterThan(curRangeBean.getMaxQuantifierId());
		}else {
			quantifierDAO.deleteRecordKeyGreaterThan(0L);
		}
		if (curRangeBean.getMaxRRId() != null) {
			levelTwoRRDao.deleteRecordKeyGreaterThan(curRangeBean.getMaxRRId());
		}else {
			levelTwoRRDao.deleteRecordKeyGreaterThan(0L);
		}
	}

}
