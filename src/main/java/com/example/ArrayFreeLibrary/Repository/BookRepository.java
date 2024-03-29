package com.example.ArrayFreeLibrary.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.ArrayFreeLibrary.Model.Book;


public interface BookRepository extends CrudRepository<Book, String>{

	
	public List<Book> findByTopicKeyword(String topicId);
}
