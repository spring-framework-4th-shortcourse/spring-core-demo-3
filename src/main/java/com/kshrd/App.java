package com.kshrd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.kshrd.service.Drawing;

@ComponentScan("com.kshrd")
public class App {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);

		Drawing drawing = ctx.getBean(Drawing.class);
		drawing.draw();

		ctx.close();
	}
}



