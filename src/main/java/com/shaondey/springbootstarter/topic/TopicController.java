package com.shaondey.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/topics")
	public List<TopicDTO> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/topics/{id}")
	public TopicDTO getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
}
