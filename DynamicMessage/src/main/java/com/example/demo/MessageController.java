package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	@GetMapping("/greet")
	public String getContent(Model model) {
		model.addAttribute("msg1", "Welcome to kodnest");
		return "greet";
	}
}
