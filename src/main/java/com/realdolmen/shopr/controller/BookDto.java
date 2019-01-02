package com.realdolmen.shopr.controller;

public class BookDto {

    public Long id;
    public String author;
    public String title;
    public Long isbn;
    public Integer pages;
    public double price;

    public BookDto() {}

    public BookDto(Long id, String author, Long isbn, String title, Integer pages, Double price) {
        this.author = author;
        this.id = id;
        this.isbn = isbn;
        this.pages = pages;
        this.title = title;
        this.price = price;
    }

    // GETTERS & SETTERS
}