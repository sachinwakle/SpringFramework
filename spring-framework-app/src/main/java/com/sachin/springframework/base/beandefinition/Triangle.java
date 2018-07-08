package com.sachin.springframework.base.beandefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context;
	
	public void draw()
	{
		System.out.println("Point A = ("+pointA.getX()+", "+pointA.getY()+")");
		System.out.println("Point B = ("+pointB.getX()+", "+pointB.getY()+")");
		System.out.println("Point C = ("+pointC.getX()+", "+pointC.getY()+")");
	}
	
	public Point getPointA() {
		return pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}

	@Override
	public void setBeanName(String bean) {
		System.out.println("Bean: "+bean);
		
	}
}
