package com.sachin.datasupport.base.demo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		DaoImpl dao = context.getBean("dao",DaoImpl.class);
		
		/*Circle circle = dao.getCircle(1);*/
		/*Circle circle = dao.getCircleForId(1);
		System.out.println("CircleId: "+circle.getId()+" | CircleName: "+circle.getName());*/
		
		/*System.out.println(""+dao.getCircleCount());
		System.out.println("CircleName: "+dao.getCircleNameForId(1));*/
		
		dao.addCircle(new Circle(5, "Fifth Circle"));
		
		List<Circle> list = dao.getAllCircles();
		for(Circle circle:list)
			System.out.println("CircleId: "+circle.getId()+" | CircleName: "+circle.getName());
		
//		dao.createTriangle();
		
	}
}
