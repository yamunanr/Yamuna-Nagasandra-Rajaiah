package com.inmemory.gleifparser.mappers;

import com.inmemory.gleifparser.entity.GleifHeader;
import com.inmemory.gleifparser.model.level1.LEIHeaderType;
import com.inmemory.gleifparser.model.level2_rex.ExceptionHeaderType;
import com.inmemory.gleifparser.model.level2_rr.RRHeaderType;
import com.inmemory.gleifparser.utils.DateUtils;

public final class HeaderMapper {

	public static GleifHeader convertLeiHeaderToEntity(LEIHeaderType leiHeader) {
		GleifHeader entity=new GleifHeader();
		entity.setContentDate(DateUtils
				.convertXmlGregorianCalToDate(leiHeader.getContentDate()));
		entity.setOriginator(leiHeader.getOriginator());
		entity.setFileContent(leiHeader.getFileContent().name());
		entity.setDeltaStart(DateUtils
				.convertXmlGregorianCalToDate(leiHeader.getDeltaStart()));
		entity.setRecordCount(leiHeader.getRecordCount().intValue());
		
		
		return entity;
	}
	
	public static GleifHeader convertRRHeaderToEntity(RRHeaderType rrHeader) {
		GleifHeader entity=new GleifHeader();
		entity.setContentDate(DateUtils
				.convertXmlGregorianCalToDate(rrHeader.getContentDate()));
		entity.setOriginator(rrHeader.getOriginator());
		entity.setFileContent(rrHeader.getFileContent().name());
		entity.setDeltaStart(DateUtils
				.convertXmlGregorianCalToDate(rrHeader.getDeltaStart()));
		entity.setRecordCount(rrHeader.getRecordCount().intValue());
		
		
		return entity;
	}
	
	public static GleifHeader convertRepExceptionHeaderToEntity(ExceptionHeaderType exceptionHeader) {
		GleifHeader entity=new GleifHeader();
		entity.setContentDate(DateUtils
				.convertXmlGregorianCalToDate(exceptionHeader.getContentDate()));
		entity.setOriginator(exceptionHeader.getOriginator());
		entity.setFileContent(exceptionHeader.getFileContent().name());
		entity.setDeltaStart(DateUtils
				.convertXmlGregorianCalToDate(exceptionHeader.getDeltaStart()));
		entity.setRecordCount(exceptionHeader.getRecordCount().intValue());
		
		
		return entity;
	}
}
