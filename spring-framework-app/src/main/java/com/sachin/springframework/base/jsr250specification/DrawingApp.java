package com.sachin.springframework.base.jsr250specification;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		context.registerShutdownHook();
		Circle tri = (Circle) context.getBean("circle");
		tri.draw();
		context.close();
	}	

}
