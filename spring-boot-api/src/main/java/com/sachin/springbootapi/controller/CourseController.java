package com.sachin.springbootapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.springbootapi.dto.Course;
import com.sachin.springbootapi.dto.Topic;
import com.sachin.springbootapi.service.CourseService;
import com.sachin.springbootapi.service.CourseService;

@RestController
@RequestMapping("/topics")
public class CourseController {
	
	@Autowired
	CourseService service;
	
	@RequestMapping("/{topicId}/courses")
	public List<Course> getAllCources(@PathVariable String topicId)
	{
		return service.getAllCourse(topicId); 
	}
	
	@RequestMapping("/{topicId}/courses/{id}")
	public Course getCourse(@PathVariable String id)
	{
		return service.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable String topicId)
	{
		 course.setTopic(new Topic(topicId, "", ""));
		 service.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String id)
	{
		 course.setTopic(new Topic(topicId, "", ""));
		 course.setId(id);
		 service.updateCourse(course);;
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{topicId}/courses/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		service.deleteCourse(id);
	}

}
