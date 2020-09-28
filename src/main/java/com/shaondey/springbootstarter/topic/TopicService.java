package com.shaondey.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<TopicDTO> topicData = Arrays.asList(
			new TopicDTO("spring", "spring boot framework", "topic 1"),
			new TopicDTO("java", "programming in java", "topic 2"),
			new TopicDTO("controller", "mvc", "topic 3")
			);
	
	public List<TopicDTO> getAllTopics(){
		return topicData;
	}

}
