package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorValue("book")
@DiscriminatorColumn(name = "booktype", discriminatorType = DiscriminatorType.STRING)
public abstract class Book extends Article {
    @Column
    @Size(max = 100)
    private String author;
    @Column(unique = true)
    @Pattern(regexp = "\\d{3}\\-\\d{2}\\-\\d{4}\\-\\d{3}\\-\\d")
    private String isbn;
    @Column
    private int numberOfPages;
    @Column(insertable = false, updatable = false)
    private String booktype;

    public Book() {
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
