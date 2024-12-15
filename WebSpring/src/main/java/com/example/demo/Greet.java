package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Greet {
	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "Welcome to this project";
	}
	
	@RequestMapping("/greet")
	@ResponseBody
	public String greet() {
		return "Hello.....";
	}
	
	@RequestMapping("/bye")
	@ResponseBody
	public String bye() {
		return "Bye bye ...";
	}
	
}
