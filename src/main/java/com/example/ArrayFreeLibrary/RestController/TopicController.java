package com.example.ArrayFreeLibrary.RestController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ArrayFreeLibrary.Model.Topic;
import com.example.ArrayFreeLibrary.Services.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		return topicService.getAllTopics();
							
				
	}
	@GetMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	//@RequestMapping(method=RequestMethod.POST,value="/topics")
	@PostMapping("/topics")
	public void addTopic(@RequestBody @Valid Topic newTopic) {
		System.out.println("controller method: " + newTopic);
		topicService.addTopic(newTopic);
	}
	
	@PutMapping("/topics/{id}")
	public void updateTopic(@RequestBody Topic newTopic, @PathVariable String id) {
		System.out.println("put method" + newTopic);
		topicService.updateTopic(id, newTopic);
	}
	@DeleteMapping("/topics/{id}")
	public void deleteTopic( @PathVariable String id) {
		topicService.deleteTopic(id);
	}
	
	
	
}
