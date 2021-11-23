package com.springRESTChallenge.library.repository;

import com.springRESTChallenge.library.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    // custom query to search to blog post by title or description
    List<Book> findByTitleContainingOrDescriptionContaining(String text, String textAgain);

}