package com.javasampleapproach.springbatch.restartstep;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableBatchProcessing
@ImportResource({"classpath:batchjob.xml"})
public class SpringBatchRestartStepConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBatchRestartStepConfigApplication.class, args);
	}
}
