package com.holler.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodingController {
@RequestMapping("/coding")

	public static void main(String[] args) {
		SpringApplication.run(CodingController.class, args);
	}

	@RequestMapping("/")
	public String coding() {
		return "Hello Coding Dojo!";
}

	@RequestMapping("/python")
	public String python() {
		return "Python/Django was awesome!";
}
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better!";
	}
	
	
	
}