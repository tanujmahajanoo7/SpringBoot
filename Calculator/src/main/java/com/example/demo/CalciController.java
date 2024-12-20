package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class CalciController {
	
	@Autowired
	CalciService calciService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@PostMapping("/calculate")
	public String performOperation(@RequestParam("num1") double n1, @RequestParam("num2") double n2, @RequestParam("operation") String op, Model model) {
		double res;
		switch (op) {
		case "add" -> res = calciService.add(n1, n2);
		case "sub" -> res = calciService.sub(n1, n2);
		case "mul" -> res = calciService.mul(n1, n2);
		case "div" -> res = calciService.div(n1, n2);
		case "mod" -> res = calciService.mod(n1, n2);
		default -> {
			model.addAttribute("errmsg", "Invalid operation");
			return "result";
		}
		}
		model.addAttribute("res",res);
		model.addAttribute("operation", op);
		return "result";
	}
	
}
