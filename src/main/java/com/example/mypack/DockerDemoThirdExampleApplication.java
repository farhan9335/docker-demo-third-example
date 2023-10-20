package com.example.mypack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerDemoThirdExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerDemoThirdExampleApplication.class, args);
	}
	
	@GetMapping(path = "/welcome")
	public String getMessage() {
		return "This is first CI/CD example";
	}

}
