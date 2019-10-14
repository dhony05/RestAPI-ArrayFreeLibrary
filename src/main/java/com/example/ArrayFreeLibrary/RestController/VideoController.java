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
import com.example.ArrayFreeLibrary.Model.Video;
import com.example.ArrayFreeLibrary.Services.VideoService;



@RestController
public class VideoController {

	@Autowired
	private VideoService videoService;
	
	
	@RequestMapping("/topics/{id}/videos")
	public List<Video> getAllVideos(@PathVariable String id){
		return videoService.getAllVideos(id);
							
				
	}
	@GetMapping("/topics/{videoId}/videos/{id}")
	public Video getVideo(@PathVariable String id) {
		return videoService.getVideo(id);
	}
	
	//@RequestMapping(method=RequestMethod.POST,value="/topics")
	@PostMapping("/topics/{topicId}/videos")
	public void addVideos(@RequestBody Video newVideo,@PathVariable String topicId) {
		//System.out.println("controller method: " + newVideo);
		newVideo.setTopic(new Topic(topicId,"","","",""));
		videoService.addVideo(newVideo);
	}
	
	@PutMapping("/topics/{topicId}/videos/{id}")
	public void updateVideo(@RequestBody Video newVideo,@PathVariable String topicId , @PathVariable String id) {
		//System.out.println("put method" + newVideo);
		newVideo.setTopic(new Topic(topicId,"","","",""));
		videoService.updateTopic(newVideo);
	}
	@DeleteMapping("/topics/{topicsId}/videos/{id}")
	public void deleteVideo( @PathVariable String id) {
		videoService.deleteTopic(id);
	}
	
	
	
}
