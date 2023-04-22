package com.example.springCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
//		scanBasePackages = {"util"}
)
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}
