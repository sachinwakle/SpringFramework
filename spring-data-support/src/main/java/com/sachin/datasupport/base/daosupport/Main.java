package com.sachin.datasupport.base.daosupport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DaoSupportSpringConfig.xml");
		DaoSupportImpl dao = context.getBean("dao",DaoSupportImpl.class);
		System.out.println(dao.getCircleCount());
	
		
	}
}
