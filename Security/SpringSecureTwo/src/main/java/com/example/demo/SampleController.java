package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping("/admin")
	String display() {
		return "This is admin page";
	}
	
	@GetMapping("/pub")
	String display2() {
		return "anybody can access";
	}
}
