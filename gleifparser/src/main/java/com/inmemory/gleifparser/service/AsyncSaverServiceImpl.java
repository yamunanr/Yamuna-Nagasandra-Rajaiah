package com.inmemory.gleifparser.service;

import java.util.List;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.beans.BaseBean;
import com.inmemory.gleifparser.dao.LevelTwoRRDao;
import com.inmemory.gleifparser.entity.Level2RelationshipRecord;

@Service
public class AsyncSaverServiceImpl {
	@Autowired
	private LevelTwoRRDao levelTwoRRDao;

	@Async("threadPoolTaskExecutor")
	public Future<BaseBean> saveEntities(List<Level2RelationshipRecord> level2RrRecords) {
		BaseBean baseBean = new BaseBean();
		try {
			levelTwoRRDao.saveAll(level2RrRecords);
			levelTwoRRDao.flush();
		} catch (Exception ex) {
			ex.printStackTrace();
			baseBean.setError(true);
			baseBean.setMessage(ex.getMessage());
		}

		return new AsyncResult<BaseBean>(baseBean);
	}
}
