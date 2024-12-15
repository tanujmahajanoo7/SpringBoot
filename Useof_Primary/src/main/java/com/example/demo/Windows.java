package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Windows implements OS {

	@Override
	public void operate() {
		System.out.println("Windows is operating");
	}

}
