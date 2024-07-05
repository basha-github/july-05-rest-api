package com.mtz.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.book.entity.Book;
import com.mtz.book.service.BookService;

@RestController
@CrossOrigin("*")
@RequestMapping("/book")
public class BookController {
	
	
	@Autowired
	BookService bookService;
	
	
	
	@PostMapping("/add")
	public Book insertBookData(@RequestBody Book book){
		
		System.out.println("From Client --->"+book);
		
		return bookService.addNewBook(book);
		
		
	}
	
	@PostMapping("/addMore")
	public List<Book> insertAllBooks(@RequestBody List<Book> bookList){
		System.out.println("From PostMan --->"+bookList);
		return bookService.addAllBooks(bookList);
	}
	

}
