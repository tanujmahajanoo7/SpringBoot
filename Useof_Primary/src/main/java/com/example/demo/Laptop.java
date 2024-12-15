package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	OS os;
	
	@Autowired
	public Laptop(OS os) {
		super();
		this.os=os;
	}
	
	void build() {
		os.operate();
		System.out.println("Laptop is building a great app");
	}
}
