package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Pattern;

@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = Book.FIND_ALL,
                        query = "SELECT b FROM Book b"
                )
        }
)
public abstract class Book extends Item {
    public static final String FIND_ALL = "Book.findAll";

    private String author;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{4}-\\d{3}-\\d{1}")
    private String isbn;
    private String pages;
    
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

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }
}
