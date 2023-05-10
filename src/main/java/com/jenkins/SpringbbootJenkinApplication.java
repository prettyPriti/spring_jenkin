package com.jenkins;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
@RestController

public class SpringbbootJenkinApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringbbootJenkinApplication.class);

	@GetMapping("/api")
	public String getValue()
	{
		logger.info("Application started...");
		return "welcome";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringbbootJenkinApplication.class, args);
		logger.info("Application executed");
	}

}
