package com.realdolmen.shopr.domain;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Book extends Item {

    private String author;
    private String isbn;
    private short totalPages;


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

    public short getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(short totalPages) {
        this.totalPages = totalPages;
    }
}
