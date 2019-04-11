package com.inmemory.gleifparser.service;

import static com.inmemory.gleifparser.constants.Constants.SAVE_RECORDS_BATCH_SIZE;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.constants.XmlDataConstants;
import com.inmemory.gleifparser.dao.Level2ReportingExceptionDAO;
import com.inmemory.gleifparser.entity.Level2ReportingException;
import com.inmemory.gleifparser.mappers.Level2RepExceptionDbMapper;
import com.inmemory.gleifparser.model.level2_rex.ExceptionHeaderType;
import com.inmemory.gleifparser.model.level2_rex.ExceptionType;
import com.inmemory.gleifparser.utils.GleifXmlUnmarshallerFactory;

@Service
public class ReportingExceptionServiceImpl implements ReportingExceptionService {
	@Autowired
	private Level2ReportingExceptionDAO reportingExceptionDAO;
	
	private Logger logger = LoggerFactory.getLogger(ReportingExceptionServiceImpl.class);

	@Override
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader) throws XMLStreamException, JAXBException {
		if (xmlEventReader != null) {
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement()) {
					if (XmlDataConstants.LEVEL_2_REPORTING_EXCEPTION_HEADER
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						ExceptionHeaderType header = GleifXmlUnmarshallerFactory
								.getReportingExceptionsJaxbUnmarshaller()
								.unmarshal(xmlEventReader, ExceptionHeaderType.class).getValue();
							//TODO save header record
					} else if (XmlDataConstants.LEVEL_2_REPORTING_EXCEPTION_RECORDS
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						parseReportingExceptionRecords(xmlEventReader);

					}
				}
				xmlEventReader.nextEvent();

			}

		}

	}

	private void parseReportingExceptionRecords(XMLEventReader xmlEventReader)
			throws XMLStreamException, JAXBException {
		List<Level2ReportingException> level2ReportingExceptions = new ArrayList<>();
		Level2ReportingException curRecord = null;
		logger.info("Saving Reporting Exception data to database");
		while (xmlEventReader.hasNext()) {
			if (xmlEventReader.peek().isStartElement() && XmlDataConstants.LEVEL_2_REPORTING_EXCEPTION_RECORD
					.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
				ExceptionType reportingException = GleifXmlUnmarshallerFactory.getReportingExceptionsJaxbUnmarshaller()
						.unmarshal(xmlEventReader, ExceptionType.class).getValue();
				curRecord = Level2RepExceptionDbMapper.convertFromXmlToEntityObject(reportingException);
				level2ReportingExceptions.add(curRecord);
				// write in batches
				if (level2ReportingExceptions.size() >= SAVE_RECORDS_BATCH_SIZE) {
					//TODO remove temporary comments
					//reportingExceptionDAO.saveAll(level2ReportingExceptions);
					//reportingExceptionDAO.flush();
					level2ReportingExceptions.clear();
				}
			} else {
				xmlEventReader.nextEvent();
			}

		}
		if (!level2ReportingExceptions.isEmpty()) {
			reportingExceptionDAO.saveAll(level2ReportingExceptions);
			reportingExceptionDAO.flush();
		}

	}

}
