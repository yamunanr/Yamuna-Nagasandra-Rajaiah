package com.inmemory.gleifparser.service;

import javax.xml.stream.XMLEventReader;

public interface ReportingExceptionService {

	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader,String subscriberId)  throws Exception  ;
}
