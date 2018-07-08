package com.sachin.datasupport.base.hibernatesupport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("HibernateSupportSpringConfig.xml");
		DaoSupportImpl dao = context.getBean("daoSupportImpl",DaoSupportImpl.class);
		
		
		
		System.out.println(dao.getCircleCount());
	
		
	}
}
