package com.inmemory.gleifparser.service;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.JmsConfig;
import com.inmemory.gleifparser.beans.GleifJmsMessage;
import com.inmemory.gleifparser.constants.XmlDataConstants;

@Service
public class GleifFileServiceImpl implements GleifService {

	@Autowired
	private Level1LeiService level1LeiService;

	@Autowired
	private RelationshipRecordService relationshipRecordService;

	@Autowired
	private ReportingExceptionService reportingExceptionService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.inmemory.gleifparser.utils.GleifService#parseGleifFile(java.nio.file.
	 * Path)
	 */
	@Override
	public String parseGleifFile(Path xmlFilePath, String subscriberId) {
		boolean isExceptionOccured = false;
		long count = 0;
		XMLEventReader xmlEventReader = null;
		try {
			xmlEventReader = getXmlEventReaderForXmlFile(xmlFilePath);
			// determine the file type from root node type
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement()) {
					if (XmlDataConstants.LEVEL_1_LEI_XML_ROOT_TYPE
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						level1LeiService.parseAndSaveXmlFile(xmlEventReader, subscriberId);
						break;
					} else if (XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORD_XML_ROOT_TYPE
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						relationshipRecordService.parseAndSaveXmlFile(xmlEventReader, subscriberId);
						break;
					} else if (XmlDataConstants.LEVEL_2_REPORTING_EXCEPTION_XML_ROOT_TYPE
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						reportingExceptionService.parseAndSaveXmlFile(xmlEventReader, subscriberId);
						break;
					}

				}
				xmlEventReader.nextEvent();

			}

		} catch (Exception e) {
			isExceptionOccured = true;
			try {
				xmlEventReader.close();
			} catch (XMLStreamException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			xmlEventReader = null;
			e.printStackTrace();
		} finally {

			try {

				Files.deleteIfExists(xmlFilePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("count:" + count);
			if (isExceptionOccured) {
				System.out.println("exception");
			}
		}
		return null;

	}

	private XMLEventReader getXmlEventReaderForXmlFile(Path xmlFilePath)
			throws FileNotFoundException, FactoryConfigurationError, XMLStreamException {
		XMLEventReader xmlEventReader;
		final InputStream xmlStream = new DataInputStream(new FileInputStream(xmlFilePath.toFile()));
		final XMLInputFactory xmlInputFactory = XMLInputFactory.newFactory();
		xmlEventReader = xmlInputFactory.createXMLEventReader(xmlStream);
		return xmlEventReader;
	}

	@JmsListener(destination = JmsConfig.XML_PROCESSING_QUEUE)
	public void listener(GleifJmsMessage gleifJmsMessage) {
		Path xmlFilePath = Paths.get(gleifJmsMessage.getXmlFilePath());
		parseGleifFile(xmlFilePath, gleifJmsMessage.getSubscriberId());
	}

}
