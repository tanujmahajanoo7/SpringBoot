package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImplementation;

@Controller
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	UserServiceImplementation userService;
	
	@GetMapping("/")
	public String home() {
		return "login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam String username, @RequestParam String password,Model model) {
		User user = userService.findUserByUsername(username);
		
		if(user != null && user.getPassword().equals(password)) {
			userService.sendOtp(user);
			model.addAttribute("username" , username);
			return "verify-otp";
		}
		model.addAttribute("error","Invalid credentials!" + user);
		return "login";
	}
	
	@PostMapping("/verify-otp")
	public String verifyOtp(@RequestParam String otp, Model model) {
		if(userService.verifyOtp(otp)) {
			model.addAttribute("message", "OTP verified sucessfully!");
			return "dashboard";
		}
		model.addAttribute("error", "Invalid or expired");
		return "verify-otp";
	}
	
}
