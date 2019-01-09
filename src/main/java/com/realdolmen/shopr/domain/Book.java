package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "book")
public abstract class Book extends Product {

    @Column(length = 100, name = "author")
    private String author;

    @Column(name = "isbn", unique = true)
    private String isbn;

    @Column(name = "nb_pages")
    private int nbPages;

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }
}
