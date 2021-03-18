package com.vsvdev.ua;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsIntegrApplication {

	public static Logger logger = LoggerFactory.getLogger(JenkinsIntegrApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("App started....");
	}
	
	
	public static  main(String[] args) {
		logger.info("It is working");
		logger.info("It is working fine");
		SpringApplication.run(JenkinsIntegrApplication.class, args);
	}

}
