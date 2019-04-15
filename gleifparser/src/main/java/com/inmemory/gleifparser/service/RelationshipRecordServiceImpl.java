package com.inmemory.gleifparser.service;

import static com.inmemory.gleifparser.constants.Constants.SAVE_RECORDS_BATCH_SIZE;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.constants.XmlDataConstants;
import com.inmemory.gleifparser.dao.GleifHeaderDAO;
import com.inmemory.gleifparser.dao.LevelTwoRRDao;
import com.inmemory.gleifparser.entity.Level2RelationshipRecord;
import com.inmemory.gleifparser.mappers.HeaderMapper;
import com.inmemory.gleifparser.mappers.Level2RrXmlDbMapper;
import com.inmemory.gleifparser.model.level2_rr.RRHeaderType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipRecordType;
import com.inmemory.gleifparser.utils.GleifXmlUnmarshallerFactory;

@Service
public class RelationshipRecordServiceImpl extends StatusUpdaterService implements RelationshipRecordService  {

	@Autowired
	private LevelTwoRRDao levelTwoRRDao;
	@Autowired
	private GleifHeaderDAO gleifHeaderDAO;
	
	@Override
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader) throws XMLStreamException, JAXBException {

		if (xmlEventReader != null) {

			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement()) {

					if (XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORD_HEADER
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						RRHeaderType rrHeader = GleifXmlUnmarshallerFactory.getRelationshipRecordUnmarshaller()
								.unmarshal(xmlEventReader, RRHeaderType.class).getValue();
						gleifHeaderDAO.saveAndFlush(HeaderMapper.convertRRHeaderToEntity(rrHeader));

					} else if (XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORDS
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						parseRelationshipRecords(xmlEventReader);
						break;
					}
				}
				xmlEventReader.nextEvent();

			}

		}

	}

	private void parseRelationshipRecords(XMLEventReader xmlEventReader) throws XMLStreamException, JAXBException {
		List<Level2RelationshipRecord> level2relationshiprecords = new ArrayList<>();
		Level2RelationshipRecord curRecord = null;
		long count=0;
		while (xmlEventReader.hasNext()) {
			if (xmlEventReader.peek().isStartElement() && XmlDataConstants.LEVEL_2_RELATIONSHIP_RECORD
					.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
				RelationshipRecordType relationshipRecord = GleifXmlUnmarshallerFactory
						.getRelationshipRecordUnmarshaller().unmarshal(xmlEventReader, RelationshipRecordType.class)
						.getValue();
				curRecord = Level2RrXmlDbMapper.convertFromXmlToEntityObject(relationshipRecord);
				level2relationshiprecords.add(curRecord);
				// write in batches
				if (level2relationshiprecords.size() >= SAVE_RECORDS_BATCH_SIZE) {
					 levelTwoRRDao.saveAll(level2relationshiprecords);
					 levelTwoRRDao.flush();
					count += 1000;
					System.out.println("Number of records saved:" + count);
					level2relationshiprecords.clear();
				}
			} else {
				xmlEventReader.nextEvent();
			}

		}
		if (!level2relationshiprecords.isEmpty()) {
			count+=level2relationshiprecords.size();
			System.out.println("Number of records saved:"+count);
			levelTwoRRDao.saveAll(level2relationshiprecords);
			levelTwoRRDao.flush();
		}
	}

}
