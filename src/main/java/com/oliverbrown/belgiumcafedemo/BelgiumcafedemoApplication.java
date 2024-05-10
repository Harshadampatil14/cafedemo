package com.oliverbrown.belgiumcafedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (
	scanBasePackages = {"com.oliverbrown.belgiumcafedemo", "com.oliverbrown.util"}
)
public class BelgiumcafedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BelgiumcafedemoApplication.class, args);
	}

}
