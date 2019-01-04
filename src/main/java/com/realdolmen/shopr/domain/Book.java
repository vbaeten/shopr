package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Table(name = "book")
@NamedQueries(
        @NamedQuery(
                name = Book.FIND_ALL,
                query = "SELECT a FROM Book a"
        )
)
public abstract class Book extends Article implements Serializable {

    public static final String FIND_ALL = "Book.findAll";

    @Size(max = 100)
    @Column(name = "author")
    private String Author;

    //TODO unique
    @Column(name = "isbn")
    @NotNull
//    @Pattern(regexp="\\d{3}-\\d{2}-\\d{4}-\\d{3}-\\d")
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
