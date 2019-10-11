package com.example.ArrayFreeLibrary.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ArrayFreeLibrary.Model.Video;

public interface VideoRepository extends CrudRepository<Video, String>{

	public List<Video> findByTopicKeyword(String topicId);
}
