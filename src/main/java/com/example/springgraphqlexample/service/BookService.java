package com.example.springgraphqlexample.service;

import com.example.springgraphqlexample.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
}
