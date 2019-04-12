package com.inmemory.gleifparser.service;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamException;

public interface Level1LeiService {
	public void parseAndSaveXmlFile(XMLEventReader xmlEventReader)  throws XMLStreamException, JAXBException ;
}
