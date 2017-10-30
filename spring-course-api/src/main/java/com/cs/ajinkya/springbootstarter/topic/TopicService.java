package com.cs.ajinkya.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//this marks the class as business service 
@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("hibernate", "Hibernate Framework", "Hibernate Framework Description"));

	public List<Topic> getAllTopics() {
		return topics;

	}

	public Topic getTopic(String id) {
		
		Topic response = new Topic();
		for (Topic topic : topics) {
			if (topic.getId().equals(id)) {
				response.setId(topic.getId());
				response.setName(topic.getName());
				response.setDescription(topic.getDescription());
				break;
			}
		}
		return response;

	}

}
