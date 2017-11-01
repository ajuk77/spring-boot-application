package com.cs.ajinkya.springbootstarter.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * This marks the class as business service 
 */
@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<Course>();
		// Here I am interacting over the result of findAll and adding each
		// entity in the ArrayList
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;

	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);

	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public String deleteCourse(String id) {
		courseRepository.delete(id);
		return "Course with CourseId:" + id + " has been deleted";
	}

}
