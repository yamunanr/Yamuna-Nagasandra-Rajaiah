package com.inmemory.gleifparser;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@Configuration
@EnableJms
public class JmsConfig {
	public static final String XML_PROCESSING_QUEUE="xml-processing-queue";
	@Bean(name = "xmlProcessingQueue")
    public Queue xmlProcessingQueue(){
        return new ActiveMQQueue(XML_PROCESSING_QUEUE);
    }

}
