package com.infy.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.infy.entity.Author;
import com.infy.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{


	@Query("SELECT b FROM Book b JOIN b.author a WHERE a.name=?1")
	public List<Book> findByAuthor(String name);

	@Query("SELECT b FROM Book b JOIN b.author a WHERE a.aid=?1 AND b.bid=?2")
	public Optional<Book> findByIds(int aid,int bid);


}
