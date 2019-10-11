package com.example.ArrayFreeLibrary.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ArrayFreeLibrary.Model.Video;
import com.example.ArrayFreeLibrary.Repository.VideoRepository;

@Service
public class VideoService {
	
	private VideoRepository videoRepository;
	
	@Autowired
	public VideoService(VideoRepository newVideoRepository) {
		videoRepository = newVideoRepository;
		
	}
	
	
	//business service
	
	public List<Video> getAllVideos(String id){
		//return topics;
		List<Video> videos = new ArrayList<>();
		// geting all the instances from table
		videoRepository.findAll().forEach(videos::add); //method reference
		return videos;
	}
	
	
	public Video getVideo(String id) {
		//return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
		
		return videoRepository.findById(id).get();// findOne is changed to findById and the get 
	}


	public void addVideo(Video newVideo) {
		//topics.add(newTopic);
		//System.out.println("service method" + newTopic);
		videoRepository.save(newVideo); // adding to the database
		
	}


	public void updateTopic(Video newVideo) {
		videoRepository.save(newVideo);

		//topics.set(topics.indexOf(getTopic(id)),newTopic);
		
	}


	public void deleteTopic(String id) {
		//topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
		videoRepository.deleteById(id);
	}
}
