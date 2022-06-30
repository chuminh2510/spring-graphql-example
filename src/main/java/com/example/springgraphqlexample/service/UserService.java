package com.example.springgraphqlexample.service;

import com.example.springgraphqlexample.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
