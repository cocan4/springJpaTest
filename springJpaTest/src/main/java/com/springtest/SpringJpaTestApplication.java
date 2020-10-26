package com.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaTestApplication.class, args);
		System.out.println("ioc is loaded");
	}

}
