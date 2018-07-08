package com.sachin.springframework.base.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/sachin/springframework/base/lifecycle/SpringConfig.xml");
		context.registerShutdownHook();
		Triangle tri = (Triangle) context.getBean("triangle");
		tri.draw();

	}

}
