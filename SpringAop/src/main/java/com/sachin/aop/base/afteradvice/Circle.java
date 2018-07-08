package com.sachin.aop.base.afteradvice;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setter method has called");
		throw new RuntimeException();
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
