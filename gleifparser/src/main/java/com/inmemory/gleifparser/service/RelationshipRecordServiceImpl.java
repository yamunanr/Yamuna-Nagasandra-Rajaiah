package com.inmemory.gleifparser.service;

import static com.inmemory.gleifparser.constants.Constants.SAVE_RECORDS_BATCH_SIZE;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;

import javax.xml.stream.XMLEventReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.inmemory.gleifparser.beans.BaseBean;
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
		GleifHeader oldRecord = gleifHeaderDAO.findByFileContent(XmlDataConstants.FILE_TYPE_LEVEL1_LEI);
		GleifHeader gleifHeader = HeaderMapper.convertRRHeaderToEntity(rrHeader);
		StatusUpdateResponseBean statusUpdateResponseBean = new StatusUpdateResponseBean();
		statusUpdateResponseBean.setTotalNumberOfRecords(gleifHeader.getRecordCount());
		statusUpdateResponseBean.setNumberOfProcessedRecords(0);
		statusUpdateResponseBean
				.setPercentageProcessed(calculatePercentage(statusUpdateResponseBean.getNumberOfProcessedRecords(),
						statusUpdateResponseBean.getTotalNumberOfRecords()));
		statusUpdateResponseBean.setStatus(Constants.STATUS_IN_PROGRESS);

		// if it is not a complete file then ignore
		if (!XmlDataConstants.FILE_CONTENT_FULL_PUBLISHED.equalsIgnoreCase(rrHeader.getFileContent().value())) {
			statusUpdateResponseBean.setError(true);
			statusUpdateResponseBean.setStatus(Constants.STATUS_FAILED);
			statusUpdateResponseBean.setMessage(Constants.ONLY_FULL_PUBLISHED_FILES_ARE_SUPPORTED);
			sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
			return;
		}
		if (oldRecord != null) {
			gleifHeaderDAO.delete(oldRecord);
		}
		statusUpdateResponseBean.setMessage(Constants.DELETE_OLD_RECORDS);
		sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);

		qualifierDAO.deleteAll();
		quantifierDAO.deleteAll();
		levelTwoRRDao.deleteAll();
		statusUpdateResponseBean.setMessage(Constants.STATUS_IN_PROGRESS);
		sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);

		List<Future<BaseBean>> runningTasks = new ArrayList<>();
		List<Future<BaseBean>> completedTasks = new ArrayList<>();
		boolean isError = false;
		try {
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
								.add(asyncSaverServiceImpl.saveEntities(new ArrayList<>(level2relationshiprecords)));
						System.out.println("RUnning tasks:" + runningTasks.size());
						isError = checkAndUpdateRunningTasks(statusUpdateResponseBean, runningTasks, completedTasks);
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
			long currentProcessedCount = statusUpdateResponseBean.getNumberOfProcessedRecords();
			while (!runningTasks.isEmpty()) {
				isError = checkAndUpdateRunningTasks(statusUpdateResponseBean, runningTasks, completedTasks);
				if (isError || currentProcessedCount < statusUpdateResponseBean.getNumberOfProcessedRecords()) {
					sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
					currentProcessedCount = statusUpdateResponseBean.getNumberOfProcessedRecords();
				}
			}
			if (!isError) {
				statusUpdateResponseBean.setStatus(Constants.STATUS_COMPLETE);
				sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
			}

		} catch (Exception ex) {
			/*
			 * catch (JAXBException | XMLStreamException | InterruptedException |
			 * ExecutionException | DataAccessException ex) {
			 */
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

}
