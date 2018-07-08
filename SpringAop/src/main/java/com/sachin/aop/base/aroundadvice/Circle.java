package com.sachin.aop.base.aroundadvice;

public class Circle {
	private String name;

	public String getName() {
//		throw new RuntimeException();
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setter method has called");
		
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("setNameAndReturn method has called");
		return name;
	}
	
	public void draw()
	{
		System.out.println("circle drawn");
	}

}
