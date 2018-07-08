package com.sachin.springframework.base.requried;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("/com/sachin/springframework/base/requried/SpringConfig.xml");
		Triangle tri = (Triangle) context.getBean("triangle");
		tri.draw();
		context.registerShutdownHook();

	}

}
