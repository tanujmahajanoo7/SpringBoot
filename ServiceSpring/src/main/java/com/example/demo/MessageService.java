package com.example.demo;
import org.springframework.stereotype.Service;
@Service
public class MessageService {
	
	public String buildMessage(String name) {
		return "Hello " + name + " welcome to Janta";
	}
}
