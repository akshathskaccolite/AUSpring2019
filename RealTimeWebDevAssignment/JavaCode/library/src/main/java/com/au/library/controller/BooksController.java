package com.au.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.au.library.au.model.Book;
import com.au.library.repository.BooksDAO;

@RestController
public class BooksController {
	@Autowired
	BooksDAO booksDAO;
	
	@RequestMapping(value="/books",method=RequestMethod.GET,produces="application/json")
	public List<Book> getAll() {
		List<Book> books = new ArrayList<Book>();
//		books.add(new Book("1","Happy Potter","JKR",200D,"Harry and his 2 friends"));
//		books.add(new Book("2","Happy Potter","JKR",300D,"Harry and his 2 friends"));
//		books.add(new Book("3","Happy Potter","JKR",400D,"Harry and his 2 friends"));
		books=booksDAO.all();
		return books;	
	}
	
	@RequestMapping(value="/books/{bookId}/get",method=RequestMethod.GET,produces="application/json")
	public Book getOneBook(@PathVariable(value="bookId") String bookId) {
//		return new Book("1","Happy Potter","JKR",200D,"Harry and his 2 friends");
		return booksDAO.get(bookId);
	}
	
	@RequestMapping(value="/books",method=RequestMethod.POST)
	public Book create(@RequestBody Book bookToCreate){
		return booksDAO.create(bookToCreate);	
	}
	
	@RequestMapping(value="/cart",method=RequestMethod.GET,produces="application/json")
	public List<Book> getAllCart() {
		List<Book> books = new ArrayList<Book>();
		books=booksDAO.allFromCart();
		return books;	
	}
	
	@RequestMapping(value="/cart",method=RequestMethod.POST)
	public Book createToCart(@RequestBody Book bookToCreate){
		return booksDAO.createInCart(bookToCreate);	
	}
}
