package com.inmemory.gleifparser.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.constants.XmlDataConstants;
import com.inmemory.gleifparser.dao.Level2ExceptionReasonDao;
import com.inmemory.gleifparser.dao.Level2ExceptionReferenceDAO;
import com.inmemory.gleifparser.dao.Level2ReportingExceptionDAO;
import com.inmemory.gleifparser.entity.Level2ExceptionReason;
import com.inmemory.gleifparser.entity.Level2ExceptionReference;
import com.inmemory.gleifparser.entity.Level2ReportingException;
import com.inmemory.gleifparser.mappers.Level2RepExceptionDbMapper;
import com.inmemory.gleifparser.model.level2_rex.ExceptionHeaderType;
import com.inmemory.gleifparser.model.level2_rex.ExceptionType;
import com.inmemory.gleifparser.utils.GleifXmlUnmarshallerFactory;

@Service
public class ReportingExceptionServiceImpl implements ReportingExceptionService {
@Autowired
private Level2ReportingExceptionDAO reportingExceptionDAO;

@Autowired
private Level2ExceptionReasonDao level2ExceptionReasonDao;

@Autowired
private Level2ExceptionReferenceDAO level2ExceptionReferenceDAO;


	@Override
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader) throws XMLStreamException, JAXBException {
		if (xmlEventReader != null) {
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement()) {
					if (XmlDataConstants.LEVEL_2_REPORTING_EXCEPTION_HEADER
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						ExceptionHeaderType header = GleifXmlUnmarshallerFactory.getReportingExceptionsJaxbUnmarshaller()
								.unmarshal(xmlEventReader, ExceptionHeaderType.class).getValue();
					} else if (XmlDataConstants.LEVEL_2_REPORTING_EXCEPTION_RECORDS
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						parseReportingExceptionRecords(xmlEventReader);
						
					}
				}
				xmlEventReader.nextEvent();

			}

		}

	}
	
	private void parseReportingExceptionRecords(XMLEventReader xmlEventReader) throws XMLStreamException, JAXBException {
		List<Level2ReportingException> level2ReportingExceptions=new ArrayList<>();
		List<Level2ExceptionReference> level2ExceptionReferences=new ArrayList<>();
		List<Level2ExceptionReason> level2ExceptionReasons=new ArrayList<>();
		Level2ReportingException curRecord=null;
		while (xmlEventReader.hasNext()) {
			if (xmlEventReader.peek().isStartElement() && XmlDataConstants.LEVEL_2_REPORTING_EXCEPTION_RECORD
					.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
				ExceptionType reportingException = GleifXmlUnmarshallerFactory.getReportingExceptionsJaxbUnmarshaller()
						.unmarshal(xmlEventReader, ExceptionType.class).getValue();
				curRecord=Level2RepExceptionDbMapper.convertFromXmlToEntityObject(reportingException);
				level2ReportingExceptions.add(curRecord);
				level2ExceptionReferences.addAll(curRecord.getLevel2ExceptionReferences()); 
				level2ExceptionReasons.addAll(curRecord.getLevel2ExceptionReasons());
				//write in batches
				if(level2ReportingExceptions.size()>=1000) {
					saveEntitiesAndClearList(level2ReportingExceptions,level2ExceptionReferences,level2ExceptionReasons);
				}
				
			} else {
				xmlEventReader.nextEvent();
			}

		}
		saveEntitiesAndClearList(level2ReportingExceptions,level2ExceptionReferences,level2ExceptionReasons);
		
	}
	
	private void saveEntitiesAndClearList(List<Level2ReportingException> level2ReportingExceptions,
			List<Level2ExceptionReference> level2ExceptionReferences, List<Level2ExceptionReason> level2ExceptionReasons) {
		reportingExceptionDAO.saveAll(level2ReportingExceptions);
		reportingExceptionDAO.flush();
		/*
		 * level2ExceptionReasonDao.saveAll(level2ExceptionReasons);
		 * level2ExceptionReasonDao.flush();
		 * level2ExceptionReferenceDAO.saveAll(level2ExceptionReferences);
		 * level2ExceptionReferenceDAO.flush();
		 */
		//clear list
		level2ReportingExceptions.clear();
		level2ReportingExceptions.clear();
		level2ExceptionReasons.clear();
		
	}

}
