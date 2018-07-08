package com.sachin.springframework.base.beanautowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		Triangle tri = (Triangle) context.getBean("triangle");
		tri.draw();

	}

}
