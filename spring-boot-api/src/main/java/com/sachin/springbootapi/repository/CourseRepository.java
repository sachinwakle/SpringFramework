package com.sachin.springbootapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sachin.springbootapi.dto.Course;

public interface CourseRepository extends CrudRepository<Course, String>{
	
	public List<Course> findByTopicId(String topicId);

}
