package com.inmemory.gleifparser.mappers;

import com.inmemory.gleifparser.entity.GleifHeader;
import com.inmemory.gleifparser.model.level1.LEIHeaderType;
import com.inmemory.gleifparser.model.level2_rex.ExceptionHeaderType;
import com.inmemory.gleifparser.model.level2_rr.RRHeaderType;

public final class HeaderMapper {

	public static GleifHeader convertLeiHeaderToEntity(LEIHeaderType leiHeader) {
		GleifHeader entity=new GleifHeader();
		
		return entity;
	}
	
	public static GleifHeader convertRRHeaderToEntity(RRHeaderType rrHeader) {
		GleifHeader entity=new GleifHeader();
		return entity;
	}
	
	public static GleifHeader convertRepExceptionHeaderToEntity(ExceptionHeaderType exceptionHeader) {
		GleifHeader entity=new GleifHeader();
		
		return entity;
	}
}
