package com.example.ArrayFreeLibrary.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ArrayFreeLibrary.Model.Book;
import com.example.ArrayFreeLibrary.Repository.BookRepository;

@Service
public class BookService {
	
	private BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository newBookRepository) {
    bookRepository = newBookRepository;
		
	}
	
	
	//business service
	
	public List<Book> getAllBooks(){
		//return topics;
		List<Book> books = new ArrayList<>();
		// geting all the instances from table
		bookRepository.findAll().forEach(books::add); //method reference
		return books;
	}
	
	
	public Book getBook(String id) {
		//return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
		
		return bookRepository.findById(id).get();// findOne is changed to findById and the get 
	}


	public void addBook(Book newBook) {
		//topics.add(newTopic);
		//System.out.println("service method" + newTopic);
		bookRepository.save(newBook); // adding to the database
		
	}


	public void updateBook(String id, Book newBook) {
		bookRepository.save(newBook);

		//topics.set(topics.indexOf(getTopic(id)),newTopic);
		
	}


	public void deleteBook(String id) {
		//topics.removeIf(t -> t.getId().equalsIgnoreCase(id));
		bookRepository.deleteById(id);
	}
}
