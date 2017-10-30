package com.cs.ajinkya.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

//this marks the class as business service 
@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(
			Arrays.asList(
					new Topic("spring", "Spring Framework", "Spring Framework Description"),
					new Topic("hibernate", "Hibernate Framework", "Hibernate Framework Description")));

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

	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		for (int i = 0; i < topics.size(); i++) {
			if (topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public String deleteTopic(String id) {
		
		for(int i = 0; i < topics.size(); i++) {
			if(topics.get(i).getId().equals(id)){
				topics.remove(i);
				return "Topic with TopicId:" + id + " has been removed from the database";
			}
		}
		
		return "Topic with TopicId:" + id + " doesn't exists";
	}

}
