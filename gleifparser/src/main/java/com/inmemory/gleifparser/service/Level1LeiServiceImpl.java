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
import com.inmemory.gleifparser.dao.Level1LeiRecordDao;
import com.inmemory.gleifparser.entity.Level1LeiRecord;
import com.inmemory.gleifparser.mappers.HeaderMapper;
import com.inmemory.gleifparser.mappers.LeiOneXmlDbMapper;
import com.inmemory.gleifparser.model.level1.LEIHeaderType;
import com.inmemory.gleifparser.model.level1.LEIRecordType;
import com.inmemory.gleifparser.utils.GleifXmlUnmarshallerFactory;

@Service
public class Level1LeiServiceImpl implements Level1LeiService {

	@Autowired
	private Level1LeiRecordDao level1LeiRecordDao;
	@Autowired
	private GleifHeaderDAO gleifHeaderDAO;

	@Override
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader) throws XMLStreamException, JAXBException {
		if (xmlEventReader != null) {
			while (xmlEventReader.hasNext()) {
				if (xmlEventReader.peek().isStartElement()) {
					if (XmlDataConstants.LEVEL_1_LEI_HEADER_ROOT
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						LEIHeaderType leiHeader = GleifXmlUnmarshallerFactory.getLeiXmlUnmarshaller()
								.unmarshal(xmlEventReader, LEIHeaderType.class).getValue();
						gleifHeaderDAO.saveAndFlush(HeaderMapper.convertLeiHeaderToEntity(leiHeader));
					} else if (XmlDataConstants.LEVEL_1_LEI_RECORDS_ROOT
							.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
						parseLeiRecords(xmlEventReader);
						break;
					}
				}
				xmlEventReader.nextEvent();

			}
		}

	}

	private void parseLeiRecords(XMLEventReader xmlEventReader) throws JAXBException, XMLStreamException {
		List<Level1LeiRecord> leiRecords = new ArrayList<Level1LeiRecord>();
		Level1LeiRecord curRecord = null;
		long count=0;
		while (xmlEventReader.hasNext()) {
			if (xmlEventReader.peek().isStartElement() && XmlDataConstants.LEVEL_1_LEI_RECORD_ROOT
					.equalsIgnoreCase(xmlEventReader.peek().asStartElement().getName().getLocalPart())) {
				LEIRecordType leiRecord = GleifXmlUnmarshallerFactory.getLeiXmlUnmarshaller()
						.unmarshal(xmlEventReader, LEIRecordType.class).getValue();
				curRecord = LeiOneXmlDbMapper.convertFromXmlToEntityObject(leiRecord);
				leiRecords.add(curRecord);
				// write in batches
				if (leiRecords.size() >= SAVE_RECORDS_BATCH_SIZE) {
					 level1LeiRecordDao.saveAll(leiRecords);
					 level1LeiRecordDao.flush();
					leiRecords.clear();
					count+=1000;
					System.out.println("Number of records saved:"+count);
				}
			}
			xmlEventReader.nextEvent();

		}
		if (!leiRecords.isEmpty()) {
			count+=leiRecords.size();
			System.out.println("Number of records saved:"+count);
			level1LeiRecordDao.saveAll(leiRecords);
			level1LeiRecordDao.flush();

		}
	}

}
