package com.shaondey.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<TopicDTO> topicData = new ArrayList<>(Arrays.asList(
			new TopicDTO("spring", "spring boot framework", "topic 1"),
			new TopicDTO("java", "programming in java", "topic 2"),
			new TopicDTO("controller", "mvc", "topic 3")
			));
	
	public List<TopicDTO> getAllTopics(){
		return topicData;
	}
	
	public TopicDTO getTopic(String id) {
		return topicData.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(TopicDTO topic) {
		topicData.add(topic);
	}

	public void updateTopic(String id, TopicDTO topic) {
		for (int currentIndex = 0; currentIndex < topicData.size(); currentIndex++) {
			TopicDTO currentTopic = topicData.get(currentIndex);
			if (currentTopic.getId().equals(id)) {
				topicData.set(currentIndex, topic);
				return;
			}
		}
	}
}
