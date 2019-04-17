package com.inmemory.gleifparser.service;

import javax.xml.stream.XMLEventReader;

public interface RelationshipRecordService {
	
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader,String subscriberId) 	throws Exception  ;

}
