package com.jenkins.jenkinexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinexampleApplication.class, args);

		System.out.println("****** Hello World *********");
		System.out.println("****** Jenkins verification CICD*********");
	}


}
