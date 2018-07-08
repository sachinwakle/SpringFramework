package com.sachin.springframework.base.jsr250specification;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

public class Circle implements Shape {

	
	private Point center;

	public Point getCenter() {
		return center;
	}

//	@Resource(name="pointB")
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw()
	{
		System.out.println("Center Point = ("+center.getX()+", "+center.getY()+")");
	}
	
	@PostConstruct
	public void myinitialization()
	{
		System.out.println("--------My initialization---------");
	}
	
	@PreDestroy
	public void destruction()
	{
		System.out.println("--------Going to be end---------");
	}
	
}
