package com.nagarro.booksApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.booksApi.entity.Book;
import com.nagarro.booksApi.services.BookService;

@RestController
public class BooksController {
	
	
	BookService bookService=new BookService();
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookService.getAllBooks();
	}


}
