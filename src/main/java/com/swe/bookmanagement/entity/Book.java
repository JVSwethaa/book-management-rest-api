package com.swe.bookmanagement.entity;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Author must not be empty")
    private String author;

    @NotBlank(message = "Title must not be empty")
    private String title;

    @Positive(message = "Price must be greater than zero")
    private Double price;

    public Book(){
    }

    public Book(String author, String title, Double price){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public Long getId(){
        return id;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getTitle(){
        return this.title;
    }

    public Double getPrice(){
        return this.price;
    }

}
