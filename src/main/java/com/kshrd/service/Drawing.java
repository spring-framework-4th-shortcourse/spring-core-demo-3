package com.kshrd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kshrd.model.Shape;

@Component
public class Drawing {
	
	private Shape shape;
	
	/*
	@Autowired //Constructor-Based injection
	public Drawing(Shape shape){ 
		this.shape = shape;
	}
	*/

	@Autowired  //Setter-Based injection
	@Qualifier("circle")  //In case there are more than 1 bean type in container, use @Qualifier to call the specific bean
	public void setShape(Shape shape){
		this.shape = shape;
	}
	
	public void draw(){
		System.out.println("Drawing " + shape.getType());
	}
}
