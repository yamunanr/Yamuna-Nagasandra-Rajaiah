package com.inmemory.gleifparser.service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

import com.inmemory.gleifparser.constants.XmlDataConstants;
import com.inmemory.gleifparser.model.level1.LEIHeaderType;
import com.inmemory.gleifparser.model.level1.LEIRecordType;
import com.inmemory.gleifparser.model.level1.LEIRecordsType;
import com.inmemory.gleifparser.utils.GleifXmlUnmarshallerFactory;

public final class LevelOneLeiParseHelper {
	/**
	 * @param xmlEventReader
	 * @throws JAXBException
	 * @throws XMLStreamException
	 */
	public static void parseFile(XMLEventReader xmlEventReader) throws JAXBException, XMLStreamException {
		if (xmlEventReader != null) {

			while (xmlEventReader.hasNext()) {
				if (XmlDataConstants.LEVEL_1_LEI_HEADER_ROOT
						.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
					LEIHeaderType leiHeader = GleifXmlUnmarshallerFactory.getRelationshipRecordUnmarshaller()
							.unmarshal(xmlEventReader, LEIHeaderType.class).getValue();

				} else if (XmlDataConstants.LEVEL_1_LEI_RECORDS_ROOT
						.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
					parseLeiRecords(xmlEventReader);

				} else {
					xmlEventReader.nextEvent();
				}

			}

		}
	}

	private static void parseLeiRecords(XMLEventReader xmlEventReader) throws JAXBException, XMLStreamException {
		while (xmlEventReader.hasNext()) {
			if (XmlDataConstants.LEVEL_1_LEI_RECORD_ROOT
					.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
				LEIRecordType leiRecord = GleifXmlUnmarshallerFactory.getLeiXmlUnmarshaller()
						.unmarshal(xmlEventReader, LEIRecordType.class).getValue();

			} else {
				xmlEventReader.nextEvent();
			}

		}
	}
}
