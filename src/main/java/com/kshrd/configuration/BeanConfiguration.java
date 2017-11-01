/*package com.kshrd.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kshrd.model.Circle;
import com.kshrd.model.Polygon;
import com.kshrd.model.Triangle;
import com.kshrd.service.Drawing;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Triangle triangle() {
		return new Triangle();
	}
	@Bean
	public Circle circle() {
		return new Circle();
	}
	@Bean
	public Polygon polygon() {
		return new Polygon();
	}
	@Bean
	public Drawing drawing() {
		Drawing drawing = new Drawing(polygon());
		return drawing;
	}
}


*/