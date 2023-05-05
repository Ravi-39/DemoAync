package com.ravi.AsyncData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsyncDataApplication.class, args);
	}

}
