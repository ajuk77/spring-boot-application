package com.cs.ajinkya.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	
	//get courses under one topic
	//one topic can have many courses
	public List<Course> findByName(String name);
	public List<Course> findByDescription(String description);
	public List<Course> findByTopicId(String topicId);
	
	
	//getAllTopics
	//getTopic(String id)
	//updateTopic(Topic topic)
	//deleteTopic(String id)

}
