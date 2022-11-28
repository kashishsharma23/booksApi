package com.nagarro.booksApi.services;

import java.util.ArrayList;
import java.util.List;

import com.nagarro.booksApi.entity.Book;


public class BookService {
	
	Book book1=new Book(1, "Harry Potter", "JK Rowling");
	Book book2=new Book(2, "The India Story", "Jalal");
	Book book3=new Book(3, "Lal Salam", "Smriti Irani");

	ArrayList<Book> list=new ArrayList<Book>();
	public List<Book> getAllBooks()
	{
		list.add(book1);
		list.add(book2);
		list.add(book3);
		return list;
	}


}
