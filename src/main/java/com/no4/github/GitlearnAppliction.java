package com.no4.github;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GitlearnAppliction {
	private final  static Logger logger = LoggerFactory.getLogger(GitlearnAppliction.class);
	public static void main(String[] args) {
		logger.info("启动...start");
       SpringApplication.run(GitlearnAppliction.class, args); 
       logger.info("启动...success");
	}
}
