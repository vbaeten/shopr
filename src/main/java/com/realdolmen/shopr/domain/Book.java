package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Book extends Article {

    //TODO length 100
    @Column(name = "author")
    private String Author;

    //TODO 978-90-1234-567-8, validate format, verplicht, uniek
    @Column(name = "isbn")
    private long isbn;

    @Column (name = "pages")
    private int pages;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
