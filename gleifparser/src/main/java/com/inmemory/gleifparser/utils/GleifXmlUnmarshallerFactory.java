package com.inmemory.gleifparser.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.inmemory.gleifparser.model.level1.LEIHeaderType;
import com.inmemory.gleifparser.model.level1.LEIRecordType;
import com.inmemory.gleifparser.model.level1.LEIRecordsType;
import com.inmemory.gleifparser.model.level2_rex.ExceptionHeaderType;
import com.inmemory.gleifparser.model.level2_rex.ExceptionType;
import com.inmemory.gleifparser.model.level2_rr.RRHeaderType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipRecordType;

public final class GleifXmlUnmarshallerFactory {
	private static Unmarshaller levelOneLeiJaxbUnmarshaller;
	private static Unmarshaller levelTwoRRJaxbUnmarshaller;
	private static Unmarshaller levelTwoParentRefJaxbUnmarshaller;
	private static Unmarshaller levelTwoRecExceptionJaxbUnmarshaller;
	
	public static Unmarshaller getLeiXmlUnmarshaller() throws JAXBException {
		if (levelOneLeiJaxbUnmarshaller == null) {
			JAXBContext jaxbContext = JAXBContext.newInstance(LEIHeaderType.class, LEIRecordsType.class,
					LEIRecordType.class);
			levelOneLeiJaxbUnmarshaller = jaxbContext.createUnmarshaller();

		}
		return levelOneLeiJaxbUnmarshaller;
	}
	public static Unmarshaller getRelationshipRecordUnmarshaller() throws JAXBException {
		if (levelTwoRRJaxbUnmarshaller == null) {
			JAXBContext jaxbContext = JAXBContext.newInstance(RRHeaderType.class, RelationshipRecordType.class);
			levelTwoRRJaxbUnmarshaller = jaxbContext.createUnmarshaller();

		}
		
		return levelTwoRRJaxbUnmarshaller;
	}
	public static Unmarshaller getLevelTwoParentRefJaxbUnmarshaller() {
		return levelTwoParentRefJaxbUnmarshaller;
	}
	public static Unmarshaller getReportingExceptionsJaxbUnmarshaller() throws JAXBException {
		if (levelTwoRecExceptionJaxbUnmarshaller == null) {
			JAXBContext jaxbContext = JAXBContext.newInstance(ExceptionHeaderType.class, ExceptionType.class);
			levelTwoRecExceptionJaxbUnmarshaller = jaxbContext.createUnmarshaller();

		}
		return levelTwoRecExceptionJaxbUnmarshaller;
	}
	
	 
	
}
