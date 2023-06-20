package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreateHelpApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreateHelpApiApplication.class, args);
		System.out.println("Database is Connected");
	}

}
