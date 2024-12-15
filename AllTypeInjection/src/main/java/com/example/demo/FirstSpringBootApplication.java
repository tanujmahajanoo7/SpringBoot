package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(FirstSpringBootApplication.class, args);
		Student student = (Student) ac.getBean("student");
		student.study();
		
		System.out.println();
		Address address = (Address) ac.getBean("address");
		address.printAddress();
	}
}
