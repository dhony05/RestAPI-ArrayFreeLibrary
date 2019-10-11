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

import com.example.ArrayFreeLibrary.Model.Book;
import com.example.ArrayFreeLibrary.Model.Topic;
import com.example.ArrayFreeLibrary.Services.BookService;



@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	@RequestMapping("/topics/{id}/books")
	public List<Book> getAllBooks(@PathVariable String id){
		return bookService.getAllBooks(id);
							
				
	}
	@GetMapping("/topics/{bookId}/books/{id}")
	public Book getBook(@PathVariable String id) {
		return bookService.getBook(id);
	}
	
	//@RequestMapping(method=RequestMethod.POST,value="/topics")
	@PostMapping("/topics/{topicId}/books")
	public void addBooks(@RequestBody @Valid Book newBook,@PathVariable String topicId) {
		System.out.println("controller method: " + newBook);
		newBook.setTopic(new Topic(topicId,"","","","",newBook.getContributor(),""));
		bookService.addBook(newBook);
	}
	
	@PutMapping("/topics/topics{id}/books/{id}")
	public void updateBook(@RequestBody Book newBook,@PathVariable String topicId, @PathVariable String id) {
		System.out.println("put method" + newBook);
		newBook.setTopic(new Topic(topicId,"","","","",newBook.getContributor(),""));
		bookService.updateBook(newBook);
	}
	@DeleteMapping("/topics/topicsId/books/{id}")
	public void deleteBook( @PathVariable String id) {
		bookService.deleteBook(id);
	}
	
	
	
}
