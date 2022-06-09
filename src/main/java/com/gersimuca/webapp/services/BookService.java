package com.gersimuca.webapp.services;

import com.gersimuca.webapp.entities.Book;
import com.gersimuca.webapp.respositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book createBook(Book book){
        bookRepository.save(book);
        return  book;
    }
}
