package com.infy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
