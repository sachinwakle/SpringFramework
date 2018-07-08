package com.sachin.aop.base.firstpart;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void draw()
	{
		System.out.println("circle drawn");
	}

}
