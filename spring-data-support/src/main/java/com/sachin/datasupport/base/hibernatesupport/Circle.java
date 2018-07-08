package com.sachin.datasupport.base.hibernatesupport;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="circle")
public class Circle {
	
	@Column(name="circle_name")
	private String name;
	
	@Id
	@Column(name="id")
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
