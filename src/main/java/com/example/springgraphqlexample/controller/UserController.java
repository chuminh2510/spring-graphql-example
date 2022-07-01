package com.example.springgraphqlexample.controller;

import com.example.springgraphqlexample.entity.User;
import com.example.springgraphqlexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    @QueryMapping
    public List<User> findAllUser() {
        return userService.findAll();
    }

    @QueryMapping("findUserById")
    public User findById(@Argument Integer id) {
        return userService.findById(id);
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
