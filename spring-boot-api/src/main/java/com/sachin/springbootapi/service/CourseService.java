package com.sachin.springbootapi.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sachin.springbootapi.dto.Course;
import com.sachin.springbootapi.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository repository;
	
	public List<Course> getAllCourse(String topicId)
	{
		List<Course> courses = new ArrayList<>();
		repository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id)
	{
		return repository.findById(id).get();
	}

	public void addCourse(Course course) {
		repository.save(course);
	}

	public void updateCourse(Course course) {
		repository.save(course);
	}

	public void deleteCourse(String id) {
		repository.deleteById(id);
	}
}
