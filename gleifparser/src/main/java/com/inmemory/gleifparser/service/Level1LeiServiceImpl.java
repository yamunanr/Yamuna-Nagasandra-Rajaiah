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
import com.inmemory.gleifparser.beans.LevelOneLeiRangeBean;
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

	@Autowired
	private AsyncSaverServiceImpl asyncSaverServiceImpl;

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

		List<Level1LeiRecord> level2relationshiprecords = new ArrayList<>();
		Level1LeiRecord curRecord = null;

		List<Future<BaseBean>> runningTasks = new ArrayList<>();
		List<Future<BaseBean>> completedTasks = new ArrayList<>();
		GleifHeader oldHeader = gleifHeaderDAO.findByFileContent(XmlDataConstants.FILE_TYPE_LEVEL1_LEI);
		GleifHeader newHeader = HeaderMapper.convertLeiHeaderToEntity(leiHeader);
		StatusUpdateResponseBean statusUpdateResponseBean = initializeStatusResponseBean(newHeader);
		sendXmlUploadStatusToSubscribers(subscriberId, statusUpdateResponseBean);
		boolean isError = false;
		LevelOneLeiRangeBean curRangeBean = null;
		try {
			// before inserting find current records primary key ranges so it can be deleted
			curRangeBean = findMinMaxRanges();
			// if it is not a complete file then ignore
			if (!XmlDataConstants.FILE_CONTENT_FULL_PUBLISHED.equalsIgnoreCase(leiHeader.getFileContent().value())) {
				sendFailedStatus(subscriberId, Constants.ONLY_FULL_PUBLISHED_FILES_ARE_SUPPORTED,
						statusUpdateResponseBean);
				return;
			}
			long currentProcessedCount = 0;
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement() && XmlDataConstants.LEVEL_1_LEI_RECORD_ROOT
						.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
					LEIRecordType leiRecordType = GleifXmlUnmarshallerFactory.getLeiXmlUnmarshaller()
							.unmarshal(xmlEventReader, LEIRecordType.class).getValue();
					curRecord = LeiOneXmlDbMapper.convertFromXmlToEntityObject(leiRecordType);
					level2relationshiprecords.add(curRecord);
					// write in batches
					if (level2relationshiprecords.size() >= SAVE_RECORDS_BATCH_SIZE) {
						runningTasks
								.add(asyncSaverServiceImpl.saveLeiEntities(new ArrayList<>(level2relationshiprecords)));
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
				level1LeiRecordDao.saveAll(level2relationshiprecords);
				level1LeiRecordDao.flush();
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

	private LevelOneLeiRangeBean findMinMaxRanges() {
		LevelOneLeiRangeBean curRangeBean = new LevelOneLeiRangeBean();
		curRangeBean.setMinLeiId(level1LeiRecordDao.findMinId());
		curRangeBean.setMaxLeiId(level1LeiRecordDao.findMaxId());
		return curRangeBean;
	}

	private void deleteOldRecords(LevelOneLeiRangeBean curRangeBean, GleifHeader oldRecord) {
		if (curRangeBean.getMinLeiId() != null) {
			level1LeiRecordDao.deleteAllRecordsInRange(curRangeBean.getMinLeiId(), curRangeBean.getMaxLeiId());
		}
		if (oldRecord != null) {
			gleifHeaderDAO.delete(oldRecord);
		}
	}

	private void deletenewlyInsertedRecords(LevelOneLeiRangeBean curRangeBean) {
		if (curRangeBean.getMaxLeiId() != null) {
			level1LeiRecordDao.deleteRecordKeyGreaterThan(curRangeBean.getMaxLeiId());
		}else {
			level1LeiRecordDao.deleteRecordKeyGreaterThan(0L);
		}

	}

}
