package com.sachin.aop.base.customadviceannotations;

public class Circle {
	private String name;

	public String getName() {
//		throw new RuntimeException();
		return name;
	}

	@Loggable
	public void setName(String name) {
		this.name = name;
		System.out.println("setter method has called");
		
	}
	
	public String setNameAndReturn(String name) {
		this.name = name;
		System.out.println("setNameAndReturn method has called");
		return name;
	}
	
	@Loggable
	public void draw()
	{
		System.out.println("circle drawn");
	}

}
