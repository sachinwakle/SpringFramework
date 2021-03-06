package com.sachin.springframework.base.stereotypecomponents;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
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
	
	public void myinitialization()
	{
		System.out.println("--------My initialization---------");
	}
	
	public void destruction()
	{
		System.out.println("--------Going to be end---------");
	}

}
