package com.sachin.aop.base.customadviceannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("CustomAdviceAnnotations-Spring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
		shapeService.getCircle().setName("dummy circle");
		System.out.println("Circle Name: "+shapeService.getCircle().getName());
		shapeService.getCircle().draw();

	}

}
