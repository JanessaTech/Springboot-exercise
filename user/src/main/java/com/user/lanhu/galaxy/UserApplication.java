package com.user.lanhu.galaxy;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.user.lanhu.galaxy.dao")
public class UserApplication {
	private static final Logger logger = LoggerFactory.getLogger(UserApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
		logger.info("this is a info message");
		logger.warn("this is a warn message");
		logger.error("this is a error message");
	}
}
