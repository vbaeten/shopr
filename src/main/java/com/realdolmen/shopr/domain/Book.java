package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "book")
@NamedQueries(
        {
                @NamedQuery(
                        name = Book.FIND_ALL,
                        query = "SELECT b FROM Book b"
                )
        }
)
public class Book extends Item {
    public static final String FIND_ALL = "Book.findAll";

    private String author;
    private Long isbn;
    private Integer pages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
