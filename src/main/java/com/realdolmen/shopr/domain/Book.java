package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "book")
@DiscriminatorValue("book")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries(
        {
                @NamedQuery(
                        name = Book.FIND_BY_ID,
                        query = "SELECT b FROM Book b WHERE b.articleId = :id"
                ),
                @NamedQuery(
                        name = Book.FIND_ALL,
                        query = "SELECT b FROM Book b"
                )
        }
)
public abstract class Book extends Article {
    public static final String FIND_ALL = "Book.findAll";
    public static final String FIND_BY_ID = "Book.findById";

    @Size(max = 100)
    @Column(name = "author")
    private String author;
    @NotNull
    @Column(name = "isbn", unique = true)
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{4}-\\d{3}-\\d{1}")
    private String isbn;
    @Column(name = "nr_of_pages")
    private int nrOfPages;
    @Column(insertable = false, updatable = false)
    private String bookType;


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

    public int getNrOfPages() {
        return nrOfPages;
    }

    public void setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
