package com.au.library.repository;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.au.library.au.model.Book;

@Repository
public class BooksDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Book> all() {
		//String id, String bookName, String authorName, Double price, String description
		return jdbcTemplate.query("select * from libbook", (rs,i)->{
			return new Book(rs.getString("id"),
					rs.getString("title"),
					rs.getString("author"),
					rs.getDouble("price"),
					rs.getString("descrip"));
		});
	}
	
	public Book get(String id) {
//		return jdbcTemplate.queryForObject("select * from libbook where id="+id, Book.class);
		return jdbcTemplate.query("select * from libbook where id ="+id, (rs,i)->{
			return new Book(rs.getString("id"),
					rs.getString("title"),
					rs.getString("author"),
					rs.getDouble("price"),
					rs.getString("descrip"));
		}).get(0);
	}
	
	public Book create(Book book) {
		jdbcTemplate.update("insert into libbook values(?,?,?,?,?);",
				book.getId(),
				book.getDescription(),
				book.getBookName(),
				book.getAuthorName(),
				book.getPrice());
		return book;
	}

	public List<Book> allFromCart() {
		return jdbcTemplate.query("select * from cart", (rs,i)->{
			return new Book(rs.getString("id"),
					rs.getString("title"),
					rs.getString("author"),
					rs.getDouble("price"),
					rs.getString("descrip"));
		});
	}

	public Book createInCart(Book book) {
		jdbcTemplate.update("insert into cart values(?,?,?,?,?);",
				book.getId(),
				book.getDescription(),
				book.getBookName(),
				book.getAuthorName(),
				book.getPrice());
		return book;
	}
}
