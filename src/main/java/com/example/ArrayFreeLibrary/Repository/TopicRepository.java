package com.example.ArrayFreeLibrary.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ArrayFreeLibrary.Model.Topic;
@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {

}
