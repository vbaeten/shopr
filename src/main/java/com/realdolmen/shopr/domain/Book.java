package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Book extends Article {
    @Column(name = "author")
    @Size(max = 100)
    private String author;
    @Column(unique = true, name = "isbn")
    @Pattern(regexp = "\\d{3}\\-\\d{2}\\-\\d{4}\\-\\d{3}\\-\\d")
    private String isbn;
    @Column(name = "numberofpages")
    private int numberOfPages;

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

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
