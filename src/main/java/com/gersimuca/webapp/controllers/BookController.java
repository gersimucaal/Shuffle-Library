package com.gersimuca.webapp.controllers;

import com.gersimuca.webapp.entities.Book;
import com.gersimuca.webapp.respositories.BookRepository;
import com.gersimuca.webapp.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
    private BookService bookService;

    @PostMapping("/create-book")
    public Book createBook(Book book){
        return bookService.createBook(book);
    }

}
