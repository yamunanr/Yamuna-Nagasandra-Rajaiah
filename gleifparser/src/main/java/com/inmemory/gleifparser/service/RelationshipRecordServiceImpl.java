package com.inmemory.gleifparser.service;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.constants.XmlDataConstants;
import com.inmemory.gleifparser.dao.Level2RRQualifierDAO;
import com.inmemory.gleifparser.dao.Level2RrQuantifierDAO;
import com.inmemory.gleifparser.dao.LevelTwoRRDao;
import com.inmemory.gleifparser.entity.Level2RelationshipRecord;
import com.inmemory.gleifparser.entity.Level2RrRelationshipQualifier;
import com.inmemory.gleifparser.entity.Level2RrRelationshipQuantifier;
import com.inmemory.gleifparser.model.level2_rr.RRHeaderType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipRecordType;
import com.inmemory.gleifparser.utils.GleifXmlUnmarshallerFactory;

@Service
public class RelationshipRecordServiceImpl implements RelationshipRecordService {

	@Autowired
	private LevelTwoRRDao levelTwoRRDao;
	
	@Autowired
	private Level2RrQuantifierDAO levelTwoRrQuantifierDAO;
	
	@Autowired
	private Level2RRQualifierDAO levelTwoRrQualifierDAO;

	@Override
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader) throws XMLStreamException, JAXBException {

		if (xmlEventReader != null) {

			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement()) {

					if (XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORD_HEADER
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						RRHeaderType rrHeader = GleifXmlUnmarshallerFactory.getRelationshipRecordUnmarshaller()
								.unmarshal(xmlEventReader, RRHeaderType.class).getValue();

					} else if (XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORDS
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						parseRelationshipRecords(xmlEventReader);

					}
				}
				xmlEventReader.nextEvent();

			}

		}

	}

	private void parseRelationshipRecords(XMLEventReader xmlEventReader) throws XMLStreamException, JAXBException {
		List<Level2RelationshipRecord> level2relationshiprecords=new ArrayList<>();
		List<Level2RrRelationshipQualifier> level2rrrelationshipqualifiers=new ArrayList<>();
		List<Level2RrRelationshipQuantifier> level2rrrelationshipquantifiers=new ArrayList<>();
		while (xmlEventReader.hasNext()) {
			if (xmlEventReader.peek().isStartElement() && XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORD
					.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
				RelationshipRecordType relationshipRecord = GleifXmlUnmarshallerFactory.getRelationshipRecordUnmarshaller()
						.unmarshal(xmlEventReader, RelationshipRecordType.class).getValue();
					
			
			} else {
				xmlEventReader.nextEvent();
			}

		}
	}

}
