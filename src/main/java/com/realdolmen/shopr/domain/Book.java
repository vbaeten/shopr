package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "book")
@NamedQueries(
        @NamedQuery(
                name = Book.FIND_ALL,
                query = "SELECT a FROM Book a"
        )
)
public class Book extends Article implements Serializable {

    public static final String FIND_ALL = "Book.findAll";

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
