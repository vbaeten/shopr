package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries({
        @NamedQuery(
                name = Book.FIND_ALL,
                query = "SELECT b FROM Book b"
        )
})
public abstract class Book extends Item {

    @Size(max=100)
    private String author;
    @NotNull
    @Column(unique = true)
    private String isbn;
    private short totalPages;
    public static final String FIND_ALL = "Book.findAll";



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

    public short getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(short totalPages) {
        this.totalPages = totalPages;
    }


}
