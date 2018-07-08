package com.sachin.springframework.base;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
//		Triangle tri = new Triangle();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sachin/springframework/base/SpringConfig.xml");
		Triangle tri = (Triangle) context.getBean("triangle");
		tri.draw();

	}

}
