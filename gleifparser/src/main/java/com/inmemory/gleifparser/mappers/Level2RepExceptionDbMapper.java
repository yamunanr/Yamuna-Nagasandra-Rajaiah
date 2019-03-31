package com.inmemory.gleifparser.mappers;

import java.util.ArrayList;

import com.inmemory.gleifparser.entity.Level2ExceptionReason;
import com.inmemory.gleifparser.entity.Level2ExceptionReference;
import com.inmemory.gleifparser.entity.Level2ReportingException;
import com.inmemory.gleifparser.model.level2_rex.ExceptionReasonEnum;
import com.inmemory.gleifparser.model.level2_rex.ExceptionType;

public class Level2RepExceptionDbMapper {

	public static Level2ReportingException convertFromXmlToEntityObject(ExceptionType exceptionType) {
		Level2ReportingException entity = new Level2ReportingException();

	
		entity.setExceptionCategory(exceptionType.getExceptionCategory().name());
		entity.setLei(exceptionType.getLEI());
		entity.setLevel2ExceptionReasons(new ArrayList<>());
		entity.setLevel2ExceptionReferences(new ArrayList<>());
		for (ExceptionReasonEnum reasonEnum : exceptionType.getExceptionReason()) {
			Level2ExceptionReason exceptionReason = new Level2ExceptionReason();
			exceptionReason.setExceptionReason(reasonEnum.name());
			entity.getLevel2ExceptionReasons().add(exceptionReason);
			exceptionReason.setLevel2ReportingException(entity);

		}
		for (String reference : exceptionType.getExceptionReference()) {
			Level2ExceptionReference exceptionReference = new Level2ExceptionReference();
			exceptionReference.setExceptionReference(reference);
			entity.getLevel2ExceptionReferences().add(exceptionReference);
			exceptionReference.setLevel2ReportingException(entity);
		}
		return entity;
	}
}
