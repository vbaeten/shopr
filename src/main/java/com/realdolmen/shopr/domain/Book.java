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
@DiscriminatorColumn(name = "book_type")
@DiscriminatorValue("Book")
public class Book extends Item {
    public static final String FIND_ALL = "Book.findAll";

    private String author;
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{4}-\\d{3}-\\d{1}")
    private String isbn;
    private String pages;
    @Column(name = "book_type", insertable = false, updatable = false)
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

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getBookType() {
        return bookType;
    }
}
