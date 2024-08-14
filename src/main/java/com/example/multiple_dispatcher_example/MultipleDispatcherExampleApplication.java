package com.example.multiple_dispatcher_example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.multiple_dispatcher_example.app")
public class MultipleDispatcherExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultipleDispatcherExampleApplication.class, args);
	}

}
