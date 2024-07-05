package com.mtz.book.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtz.book.entity.Book;
import com.mtz.book.repo.BookRepo;


@Service
public class BookService {
	
	@Autowired
	BookRepo bookRepo;
	
	public Book addNewBook(Book book) {
		
		return bookRepo.save(book);
		
	}

	public List<Book> addAllBooks(List<Book> bookList) {
		
		List<Book> sucessList = new ArrayList<Book>();
		
		Book book;
		
		for(int i=0;i<bookList.size();i++) {
			try {
				book = bookList.get(i);
				bookRepo.save(book);	
				sucessList.add(book);
			}catch(Exception e) {
				System.out.println("Error while Saving Book Data....");
				System.out.println(e.toString());
			}
			
		}
		
		return sucessList;
	}

}
