package com.sachin.springbootapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sachin.springbootapi.dto.Topic;
import com.sachin.springbootapi.service.TopicService;

@RestController
@RequestMapping("/topics")
public class TopicController {
	
	@Autowired
	TopicService service;
	
	@RequestMapping()
	public List<Topic> getAllTopics()
	{
		return service.getAllTopics(); 
	}
	
	@RequestMapping("/{id}")
	public Topic getTopic(@PathVariable String id)
	{
		return service.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void addTopic(@RequestBody Topic topic)
	{
		 service.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public void addTopic(@RequestBody Topic topic, @PathVariable String id)
	{
		 service.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		service.deleteTopic(id);
	}

}
