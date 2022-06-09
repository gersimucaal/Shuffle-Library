package com.gersimuca.webapp.controllers;

import com.gersimuca.webapp.entities.Book;
import com.gersimuca.webapp.respositories.BookRepository;
import com.gersimuca.webapp.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/create-book")
    public Book createBook(@RequestBody Book book) { return bookService.createBook(book);
    }

    @GetMapping("/get-books")
    public List<Book> getAll(){
        List<Book> books = bookService.getAllBooks();
        return books;
    }
}
