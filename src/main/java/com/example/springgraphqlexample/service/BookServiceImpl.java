package com.example.springgraphqlexample.service;

import com.example.springgraphqlexample.entity.Book;
import com.example.springgraphqlexample.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepo;

    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }


    @Autowired
    public void setBookRepo(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }
}
