package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Unix implements OS {
	@Override
	public void operate() {
		System.out.println("Unix is operating");
	}

}
