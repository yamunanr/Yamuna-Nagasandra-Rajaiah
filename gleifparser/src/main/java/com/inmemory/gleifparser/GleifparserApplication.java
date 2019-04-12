package com.inmemory.gleifparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class GleifparserApplication {

	public static void main(String[] args) {
		SpringApplication.run(GleifparserApplication.class, args);
	}

}

