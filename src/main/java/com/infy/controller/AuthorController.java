package com.infy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infy.entity.Author;
import com.infy.entity.Book;
import com.infy.service.AuthorService;

@RestController
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/added")
	public ResponseEntity<Object> addAuthor(@RequestBody Author author){
		return authorService.addAuthor(author);
	}
	
	@GetMapping("/getAuthorById/{id}")
	public ResponseEntity<Author> getAuthorById(@PathVariable int id){
		return new ResponseEntity<Author>(authorService.getAuthorById(id),HttpStatus.OK);
	}
	
	@GetMapping("/getAllAuthors")
	public ResponseEntity<List<Author>> getAllAuthor(){
		return new ResponseEntity<List<Author>>(authorService.getAllAuthors(),HttpStatus.OK);
	}

	@GetMapping("/getAllBooks/{author}")
	public ResponseEntity<List<Book>> getAllBooks(@PathVariable("author") String name){
		return new ResponseEntity<List<Book>>(authorService.getAllBooks(name),HttpStatus.OK);
	}
	
	@GetMapping("/getByIds/{aid}/{bid}")
	public ResponseEntity<Optional<Book>> getByIds(@PathVariable int aid,@PathVariable int bid){
		return new ResponseEntity<Optional<Book>>(authorService.getByIds(aid, bid),HttpStatus.OK);
	}

}
