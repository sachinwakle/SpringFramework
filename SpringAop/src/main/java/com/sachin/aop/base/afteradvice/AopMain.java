package com.sachin.aop.base.afteradvice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("AfterAdvice-spring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().draw();
		shapeService.getCircle().setNameAndReturn("dummy circle");
//		shapeService.getCircle().setName("dummy circle");
		System.out.println(shapeService.getCircle().getName());

	}

}
