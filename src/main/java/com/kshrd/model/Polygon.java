package com.kshrd.model;

import org.springframework.stereotype.Component;

@Component
public class Polygon implements Shape{

	public String getType() {
		return "Polygon";
	}
	
}
