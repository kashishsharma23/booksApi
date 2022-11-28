package com.nagarro.booksApi.entity;

public class Book {
	private int code;
	private String  name;
	private String author;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Book(int code, String name, String author) {
		super();
		this.code = code;
		this.name = name;
		this.author = author;
	}
	

}
