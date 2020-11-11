package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//@ComponentScan({"com.example.demo.*"})
@SpringBootApplication
public class TestprojectApplication {

	public static void main(String[] args) {
		System.out.println("Test erro...");
		SpringApplication.run(TestprojectApplication.class, args);
	}

}
