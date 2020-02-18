package com.piggymetrics.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {
//TESTTTTTTT
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
