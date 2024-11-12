package com.tcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitJenkinsSample {

	public static void main(String[] args) {
		SpringApplication.run(GitJenkinsSample.class, args) ;
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome to Jenkins project";
	}

}
