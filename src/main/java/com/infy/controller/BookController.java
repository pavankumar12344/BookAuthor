package com.infy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.Book;
import com.infy.service.BookService;
@RestController
public class BookController {
	
//	@Autowired
//	private BookService bookService;
//	
//	@GetMapping("/getAllBooks/{author}")
//	public ResponseEntity<List<Book>> getAllBooks(@PathVariable("author") String name){
//		return new ResponseEntity<List<Book>>(bookService.getAllBooks(name),HttpStatus.OK);
//	}

}
