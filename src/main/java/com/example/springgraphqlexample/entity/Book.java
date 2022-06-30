package com.example.springgraphqlexample.entity;

import com.example.springgraphqlexample.enums.BookStatus;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "books")
public class Book {
    @Id
    private Integer id;
    private String name;
    private String category;
    private Integer quantity;
    private Integer price;
    private Integer authorId;
    @OneToOne
    @JoinColumn(name = "authorId", referencedColumnName = "id", insertable = false, updatable = false)
    private User author;
    @Enumerated(EnumType.STRING)
    private BookStatus status;
}
