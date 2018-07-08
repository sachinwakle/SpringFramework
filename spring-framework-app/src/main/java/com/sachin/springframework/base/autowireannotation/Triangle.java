package com.sachin.springframework.base.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public void draw()
	{
//		System.out.println("Point A = ("+pointA.getX()+", "+pointA.getY()+")");
//		System.out.println("Point B = ("+pointB.getX()+", "+pointB.getY()+")");
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
	
	@Autowired
	@Qualifier("relatedtotriangle")
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
}
