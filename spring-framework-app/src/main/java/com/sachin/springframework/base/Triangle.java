package com.sachin.springframework.base;

public class Triangle {

	private String type;
	private int height;
	private int width;
	
	public Triangle(String type) {
		this.type = type;
		System.out.println( "In constructor" );
	}
	
	public Triangle(int height, int width) {
		this.height = height;
		this.width = width;
		System.out.println( "Integer constructor" );
	}
	
	/*public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}*/
	public void draw()
	{
		System.out.println(getType() + " Triangle drawn of height: "+getHeight()+ " and width: "+getWidth());
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
