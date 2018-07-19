package com.sachin.springbootapi.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {

	@Id
	private String id;
	private String course;
	private String description;
	
	@ManyToOne
	private Topic topic;
	
	public Course() {
	}
	
	
	public Course(String id, String topic, String description, String topicId) {
		super();
		this.id = id;
		this.course = topic;
		this.description = description;
		this.topic = new Topic(topicId, "", "");
	}


	public String getId() {
		return id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}


	public String getCourse() {
		return course;
	}


	public void setCourse(String course) {
		this.course = course;
	}


	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
