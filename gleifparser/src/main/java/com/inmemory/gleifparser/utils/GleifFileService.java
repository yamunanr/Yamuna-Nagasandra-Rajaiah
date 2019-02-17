package com.inmemory.gleifparser.utils;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.model.level1.LEIRecordType;
import com.inmemory.gleifparser.model.level2_rex.ExceptionType;
import com.inmemory.gleifparser.model.level2_rr.RelationshipRecordType;

@Service
public class GleifFileService {

	public void parseGleifFile(Path xmlFilePath) throws FileNotFoundException {
		final InputStream xmlStream = new DataInputStream(new FileInputStream(xmlFilePath.toFile()));
		try {
			PartialUnmarshaller<ExceptionType> exceptionsUnMarshalling = new PartialUnmarshaller<>(
					xmlStream, ExceptionType.class);
			exceptionsUnMarshalling.next();
			while(exceptionsUnMarshalling.hasNext()) {
				ExceptionType returned = exceptionsUnMarshalling.next();
				System.out.println(returned.toString());
			}
		} catch (XMLStreamException | FactoryConfigurationError | JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void parseGleifFile1(Path xmlFilePath) {
		boolean isExceptionOccured=false;
		 long count=0;
		try {
			final InputStream xmlStream = new DataInputStream(new FileInputStream(xmlFilePath.toFile()));
			 XMLInputFactory xif = XMLInputFactory.newFactory();
			XMLEventReader xer = xif.createXMLEventReader(xmlStream);	
			 JAXBContext jc = JAXBContext.newInstance(LEIRecordType.class);
			 Unmarshaller unmarshaller = jc.createUnmarshaller();
			
			 while(xer.hasNext()) {
	                if(xer.peek().isStartElement() && xer.peek().asStartElement().getName().getLocalPart().equals("LEIRecord")) {
	                    // Unmarshal the File object from the XMLEventReader
	                	JAXBElement<LEIRecordType> relationShipRecordJaxb = unmarshaller.unmarshal(xer,LEIRecordType.class);
	                	LEIRecordType relationshipRecordType=relationShipRecordJaxb.getValue();
	                	count++;
	                }else {
	                	xer.nextEvent();
	                }
			 }
	         

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			isExceptionOccured=true;
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			isExceptionOccured=true;
			e.printStackTrace();
		} catch (JAXBException e) {
			isExceptionOccured=true;
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("count:"+count);
			if(isExceptionOccured) {
				System.out.println("exception");
			}
		}
		
	}
}
