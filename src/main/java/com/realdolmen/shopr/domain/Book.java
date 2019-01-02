package com.realdolmen.shopr.domain;


import javax.persistence.*;


@Entity
@DiscriminatorColumn(name = "type")
@DiscriminatorValue("book")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries({
        @NamedQuery(
                name = Book.FIND_ALL,
                query = "SELECT b FROM Book b"
        )
})
public class Book extends Item {

    private String author;
    private String isbn;
    private short totalPages;
    public static final String FIND_ALL = "Book.findAll";

    @Column(name = "type")
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

    public short getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(short totalPages) {
        this.totalPages = totalPages;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
