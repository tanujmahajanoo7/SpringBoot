package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SendController {
	@RequestMapping("/getpage")
	public String sendpage() {
		return "welcome";
	}
}
