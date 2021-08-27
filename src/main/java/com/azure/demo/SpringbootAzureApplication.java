package com.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureApplication {

	
	@GetMapping("/display")
	public String displayMessage() {
		return "Hello Santhosh";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureApplication.class, args);
	}

}
