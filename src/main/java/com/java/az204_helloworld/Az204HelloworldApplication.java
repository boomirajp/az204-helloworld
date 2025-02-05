package com.java.az204_helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Az204HelloworldApplication {

	public static void main(String[] args) {
		SpringApplication.run(Az204HelloworldApplication.class, args);
	}

	@GetMapping("hello")
	public String hello() {
		return "Hello world!";
	}

}
