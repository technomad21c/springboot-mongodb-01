package com.example.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class SpringBootMongoDB extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMongoDB.class, args);
	}
}
