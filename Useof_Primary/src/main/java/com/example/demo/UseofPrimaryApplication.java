package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UseofPrimaryApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(UseofPrimaryApplication.class, args);
		Laptop lappy = (Laptop) ac.getBean("laptop");
		lappy.build();
	}
}
