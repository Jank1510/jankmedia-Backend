package com.jankmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JankmediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JankmediaApplication.class, args);
		System.out.println("Api corriendo...");
	}

}
