package com.inmemory.gleifparser;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncConfig {
	@Bean(name = "threadPoolTaskExecutor")
    public Executor threadPoolTaskExecutor() {
		 ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		 executor.setMaxPoolSize(5);
        return executor;
    }
}
