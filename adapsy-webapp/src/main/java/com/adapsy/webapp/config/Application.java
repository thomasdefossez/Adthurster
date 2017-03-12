package com.adapsy.webapp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.adthruster")
public class Application {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Application.class, args);
	}

}
