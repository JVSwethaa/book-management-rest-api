package com.swe.bookmanagement.repository;

import com.swe.bookmanagement.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
