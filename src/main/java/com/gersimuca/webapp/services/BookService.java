package com.gersimuca.webapp.services;

import com.gersimuca.webapp.entities.Book;
import com.gersimuca.webapp.respositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book){
        bookRepository.save(book);
        return  book;
    }

    public List<Book> getAllBooks(){
        List<Book> books = bookRepository.findAll();
        return books;
    }
}
