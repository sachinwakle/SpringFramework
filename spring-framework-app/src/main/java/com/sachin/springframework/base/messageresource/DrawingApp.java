package com.sachin.springframework.base.messageresource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Circle tri = (Circle) context.getBean("circle");
		tri.draw();
		
		System.out.println(context.getMessage("geetings", null, "default greeting", null));
		
		
	}	

}
