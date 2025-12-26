package com.swe.bookmanagement.service;

import com.swe.bookmanagement.entity.Book;
import com.swe.bookmanagement.repository.BookRepository;
import org.springframework.stereotype.Service;
import com.swe.bookmanagement.exception.BookNotFoundException;

import java.util.List;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Long id){
        return bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    public void deleteById(Long id){
        if (!bookRepository.existsById(id)) {
            throw new BookNotFoundException(id);
        }
        bookRepository.deleteById(id);
    }

    public Book updateBook(Long id, Book updateBook){

        Book existingBook = bookRepository.findById(id).orElseThrow(() -> new BookNotFoundException(id));

        if (updateBook.getTitle() != null) {
            existingBook.setTitle(updateBook.getTitle());
        }

        if (updateBook.getAuthor() != null) {
            existingBook.setAuthor(updateBook.getAuthor());
        }

        if (updateBook.getPrice() != null) {
            existingBook.setPrice(updateBook.getPrice());
        }

        return bookRepository.save(existingBook);
    }
}
