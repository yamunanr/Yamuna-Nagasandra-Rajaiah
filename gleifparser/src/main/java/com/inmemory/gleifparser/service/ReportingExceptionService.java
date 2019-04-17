package com.inmemory.gleifparser.service;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

public interface ReportingExceptionService {

	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader,String subscriberId)  throws XMLStreamException, JAXBException ;
}
