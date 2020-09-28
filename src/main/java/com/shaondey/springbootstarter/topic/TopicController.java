package com.shaondey.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	private List<TopicDTO> getTopicData(){
		return Arrays.asList(
				new TopicDTO("spring", "spring boot framework", "topic 1"),
				new TopicDTO("java", "programming in java", "topic 2"),
				new TopicDTO("controller", "mvc", "topic 3")
				);
	}
	
	@RequestMapping("/topics")
	public List<TopicDTO> getAllTopics() {
		return getTopicData();
	}
	
}
