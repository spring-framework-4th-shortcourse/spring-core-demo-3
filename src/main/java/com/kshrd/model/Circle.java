package com.kshrd.model;

import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{

	public String getType() {
		return "Circle";
	}
	
}
