package com.inmemory.gleifparser.service;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.jms.Queue;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.inmemory.gleifparser.beans.GleifJmsMessage;

@Service
public class GleifAsyncServiceImpl implements GleifAsyncService {

	@Autowired
	@Qualifier("xmlProcessingQueue")
	private Queue queue;

	@Autowired
	private JmsTemplate jmsTemplate;

	@Override
	public String processAndSaveXmlData(Path xmlFilePath) {
		String webSocketId = RandomStringUtils.randomAlphanumeric(10)
				+ LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
		GleifJmsMessage message = new GleifJmsMessage();
		message.setSubscriberId(webSocketId);
		message.setXmlFilePath(xmlFilePath.toAbsolutePath().toString());
		jmsTemplate.convertAndSend(queue, message);
		return webSocketId;
	}

}
