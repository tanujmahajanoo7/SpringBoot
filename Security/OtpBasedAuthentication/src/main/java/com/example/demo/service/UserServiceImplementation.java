package com.example.demo.service;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Token;
import com.example.demo.entity.User;
import com.example.demo.repository.TokenRepository;
import com.example.demo.repository.UserRepository;


@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	TokenRepository tokenRepository;
	@Autowired
	JavaMailSender mailSender;
	
	@Override
	public User findUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public void sendOtp(User user) {
//		Generating 4-Digit random number in string format
		String otp = String.format("%04d",new Random().nextInt(9999));
		
//		Generating OTP
		Token token = new Token();
		token.setUser(user);
		token.setOtp(otp);
		token.setCreatedAt(LocalDateTime.now());
//		Storing OTP in DB
		tokenRepository.save(token);
		
//		Sending OTP to the user mail
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(user.getEmail());
		message.setSubject("Your OTP code");
		message.setText("Your OPT code is: " + otp);
		mailSender.send(message);
		
	}

	@Override
	public boolean verifyOtp(String otp) {
//		Fetching the Token from db
		Token token = tokenRepository.findByOtp(otp);
		if(token == null) {
			return false;
		}
		if(ChronoUnit.MINUTES.between(token.getCreatedAt(), LocalDateTime.now()) > 1) {
			tokenRepository.delete(token);
			return false;
		}
		return true;
	}
}
