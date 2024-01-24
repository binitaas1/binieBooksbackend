package com.luv2code.springbootlibrary.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name = "Book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "copies")
    private int copies;

    @Column(name = "copies_Available")
    private int copiesAvailable;

    @Column(name = "category")
    private String category;



}
