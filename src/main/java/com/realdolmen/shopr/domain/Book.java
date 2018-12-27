package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@MappedSuperclass
@Inheritance
@Table(name = "books")
public class Book extends Article {

    //TODO length 100
    @Max(100)
    @Column(name = "author")
    private String Author;

    //TODO 978-90-1234-567-8, validate format, uniek
    @Column(name = "isbn")
    @NotNull
    @Pattern(regexp="\\d{3}-\\d{2}-\\d{4}-\\d{3}-\\d")
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
