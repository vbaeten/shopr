package com.realdolmen.shopr.domain;


import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Book extends Item {

    private String Author;
    private String isbn;
    private short totalPages;


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
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
