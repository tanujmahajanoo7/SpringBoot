package com.example.demo.service;

import com.example.demo.entity.User;

public interface UserService {
	public User findUserByUsername(String username);
	public void sendOtp(User user);
	public boolean verifyOtp(String otp);	
}
