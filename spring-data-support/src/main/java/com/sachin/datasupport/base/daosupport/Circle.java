package com.sachin.datasupport.base.daosupport;

public class Circle {
	
	private String name;
	private int id;
	public Circle() {
	}
	
	public Circle(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
