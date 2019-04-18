package com.inmemory.gleifparser.service;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.beans.BaseBean;
import com.inmemory.gleifparser.dao.Level1LeiRecordDao;
import com.inmemory.gleifparser.dao.Level2ReportingExceptionDAO;
import com.inmemory.gleifparser.dao.LevelTwoRRDao;
import com.inmemory.gleifparser.entity.Level1LeiRecord;
import com.inmemory.gleifparser.entity.Level2RelationshipRecord;
import com.inmemory.gleifparser.entity.Level2ReportingException;

@Service
public class AsyncSaverServiceImpl {
	public static int count = 0;
	@Autowired
	private LevelTwoRRDao levelTwoRRDao;

	@Autowired
	private Level1LeiRecordDao level1LeiRecordDao;

	@Autowired
	private Level2ReportingExceptionDAO level2ReportingExceptionDAO;

	@Async("threadPoolTaskExecutor")
	public Future<BaseBean> saveRREntities(List<Level2RelationshipRecord> level2RrRecords) {
		BaseBean taskStatusBean = new BaseBean();
		try {
			System.out.println("Task " + (++count) + "Started");
			levelTwoRRDao.saveAll(level2RrRecords);
			levelTwoRRDao.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
			taskStatusBean.setError(true);
			taskStatusBean.setMessage(ex.getMessage());
		}
		return new AsyncResult<BaseBean>(taskStatusBean);
	}

	@Async("threadPoolTaskExecutor")
	public Future<BaseBean> saveLeiEntities(List<Level1LeiRecord> level1LeiRecords) {
		BaseBean taskStatusBean = new BaseBean();
		try {
			System.out.println("Task " + (++count) + "Started");
			level1LeiRecordDao.saveAll(level1LeiRecords);
			level1LeiRecordDao.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
			taskStatusBean.setError(true);
			taskStatusBean.setMessage(ex.getMessage());
		}
		return new AsyncResult<BaseBean>(taskStatusBean);
	}

	@Async("threadPoolTaskExecutor")
	public Future<BaseBean> saveRecExEntities(List<Level2ReportingException> level2RepExRecords) {
		BaseBean taskStatusBean = new BaseBean();
		try {
			System.out.println("Task " + (++count) + "Started");
			level2ReportingExceptionDAO.saveAll(level2RepExRecords);
			level2ReportingExceptionDAO.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
			taskStatusBean.setError(true);
			taskStatusBean.setMessage(ex.getMessage());
		}
		return new AsyncResult<BaseBean>(taskStatusBean);
	}
}
