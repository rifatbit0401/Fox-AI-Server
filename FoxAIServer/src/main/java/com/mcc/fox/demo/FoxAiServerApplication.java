package com.mcc.fox.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.mcc.fox.demo", "com.mcc.fox.service", "com.mcc.fox.controller"})
@EntityScan(basePackages="com.mcc.fox.model")
@EnableJpaRepositories("com.mcc.fox.repository")
public class FoxAiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoxAiServerApplication.class, args);
	}
}
