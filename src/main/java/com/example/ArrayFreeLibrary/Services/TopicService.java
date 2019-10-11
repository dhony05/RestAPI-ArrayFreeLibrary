package com.example.ArrayFreeLibrary.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ArrayFreeLibrary.Model.Topic;
import com.example.ArrayFreeLibrary.Repository.TopicRepository;

@Service
public class TopicService {
	
	private TopicRepository topicRepository;
	
	@Autowired
	public TopicService(TopicRepository newTopicRepository) {
		topicRepository = newTopicRepository;
		
	}
	
	
	//business service
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics = new ArrayList<>();
		// geting all the instances from table
		topicRepository.findAll().forEach(topics::add); //method reference
		return topics;
	}
	
	
	public Topic getTopic(String id) {
		//return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
		
		return topicRepository.findById(id).get();// findOne is changed to findById and the get 
	}


	public void addTopic(Topic newTopic) {
		//topics.add(newTopic);
		//System.out.println("service method" + newTopic);
		topicRepository.save(newTopic); // adding to the database
		
	}


	public void updateTopic(String id, Topic newTopic) {
		topicRepository.save(newTopic);

		//topics.set(topics.indexOf(getTopic(id)),newTopic);
		
	}


	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
		topicRepository.deleteById(id);
	}
}
