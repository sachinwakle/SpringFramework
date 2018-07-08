package com.sachin.springframework.base.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/sachin/springframework/base/innerbean/SpringConfig.xml");
		Triangle tri = (Triangle) context.getBean("triangle-alias");
		tri.draw();

	}

}
