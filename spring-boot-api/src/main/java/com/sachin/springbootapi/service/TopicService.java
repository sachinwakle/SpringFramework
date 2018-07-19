package com.sachin.springbootapi.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sachin.springbootapi.dto.Topic;
import com.sachin.springbootapi.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository repository;
	
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList<>();
		repository.findAll().forEach(topics::add);
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return repository.findById(id).get();
	}

	public void addTopic(Topic topic) {
		repository.save(topic);
	}

	public void updateTopic(Topic topic, String id) {
		repository.save(topic);
	}

	public void deleteTopic(String id) {
		repository.deleteById(id);
	}
}
