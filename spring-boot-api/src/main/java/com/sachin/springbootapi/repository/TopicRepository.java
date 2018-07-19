package com.sachin.springbootapi.repository;

import org.springframework.data.repository.CrudRepository;

import com.sachin.springbootapi.dto.Topic;

public interface TopicRepository extends CrudRepository<Topic, String>{

}
