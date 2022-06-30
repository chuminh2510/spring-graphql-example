package com.example.springgraphqlexample.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
