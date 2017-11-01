package com.kshrd.model;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{
	
	public String getType() {
		return "Traingle";
	}
	
}
