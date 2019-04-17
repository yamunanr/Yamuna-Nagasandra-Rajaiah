package com.inmemory.gleifparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJms
@EnableTransactionManagement
@EnableAsync
public class GleifparserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GleifparserApplication.class, args);
	}

}

