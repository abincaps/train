package com.abincaps.train.member.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@SpringBootApplication
@ComponentScan("com.abincaps")
public class MemberApplication {

	private static final Logger logger = LoggerFactory.getLogger(MemberApplication.class);
	public static void main(String[] args) {

		SpringApplication app = new SpringApplication(MemberApplication.class);
		Environment env = app.run(args).getEnvironment();

		logger.info("启动成功!");
		logger.info("地址：http://127.0.0.1:{}/hello", env.getProperty("server.port"));

	}
}
