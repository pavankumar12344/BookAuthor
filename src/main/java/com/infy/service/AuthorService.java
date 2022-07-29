package com.infy.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.Repository.AuthorRepository;
import com.infy.Repository.BookRepository;
import com.infy.entity.Author;
import com.infy.entity.Book;

@Service
public class AuthorService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Autowired
	private AuthorRepository authorRepository;
	

	public ResponseEntity<Object> addAuthor(Author author){
		
		Author a =authorRepository.saveAndFlush(author);
		if(authorRepository.findById(a.getId()).isPresent()) {
			return ResponseEntity.accepted().body("successfully created");
		}else
			return ResponseEntity.unprocessableEntity().body("failed");
		
	}
	
	public Author getAuthorById(int id) {
		return authorRepository.findById(id).get();
	}

	public List<Author> getAllAuthors() {
		return authorRepository.findAll();
	}
	
	public List<Book> getAllBooks(String name) {
		return bookRepository.findByAuthor(name);
	}
	
	public Optional<Book> getByIds(int aid,int bid) {

		return bookRepository.findByIds(aid,bid);
	}


}
