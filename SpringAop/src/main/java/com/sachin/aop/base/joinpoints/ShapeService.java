package com.sachin.aop.base.joinpoints;

public class ShapeService {
	
	private Circle circle;
	private Triangle triangle;
	
	public Circle getCircle() {
		return circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	

}
