package com.example.springgraphqlexample.controller;

import com.example.springgraphqlexample.entity.Book;
import com.example.springgraphqlexample.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private BookService bookService;

    @QueryMapping
    public List<Book> findAllBook() {
        return bookService.findAll();
    }

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
}
