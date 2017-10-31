package com.cs.ajinkya.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * This marks the class as business service 
 */
@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		// Here I am interating over the result of findAll and adding each
		// entity
		// in the ArrayList
		topicRepository.findAll().forEach(topics::add);
		return topics;

	}

	public Topic getTopic(String id) {
		return topicRepository.findOne(id);

	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public void updateTopic(String id, Topic topic) {
		topicRepository.save(topic);
	}

	public String deleteTopic(String id) {
		topicRepository.delete(id);
		return "Topic with TopicId:" + id + " has been deleted";
	}

}
