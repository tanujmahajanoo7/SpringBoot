package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
//	Field Injection
	@Autowired
	Address ad;
	
	public void study() {
		ad.printAddress();
		System.out.println("Student is studying");
	}
	
////	Setter Injection
//	@Autowired
//	public void setAd(Address ad) {
//		this.ad = ad;
//	}
	
////	Contructor Injection
//	@Autowired
//	public Student(Address ad) {
//		super();
//		this.ad = ad;
//	}

}

//Prority should be
//1. constructor injection
//2. setter injection
//3. field injection