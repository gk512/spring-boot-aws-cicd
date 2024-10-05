package com.app.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootKubernatesDemoApplication {
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to the AWS kubernates project ";
	}
	
	@GetMapping("/{name}")
	public String welcome(@PathVariable String name) {
		return "Hi  "+name +" Welcome to the AWS kubernates project ";
	}
	
	@GetMapping("/status")
	public String health() {
		return "Spring boot is UP and Running .....!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKubernatesDemoApplication.class, args);
	}

}
