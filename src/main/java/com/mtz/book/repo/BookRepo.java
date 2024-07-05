package com.mtz.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtz.book.entity.Book;

public interface BookRepo extends JpaRepository<Book, String> {

}
