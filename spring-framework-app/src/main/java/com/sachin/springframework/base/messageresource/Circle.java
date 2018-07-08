package com.sachin.springframework.base.messageresource;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Service
//@Repository
//@Controller
@Component  // generic
public class Circle implements Shape {

	
	private Point center;

	public Point getCenter() {
		return center;
	}

	@Resource(name="pointB")
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
