package com.sachin.springframework.base.stereotypecomponents;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sachin/springframework/base/stereotypecomponents/SpringConfig.xml");
		Circle tri = (Circle) context.getBean("circle");
		tri.draw();
	}	

}
