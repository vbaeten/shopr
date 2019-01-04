package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Book extends Article{
    @Size(max = 100)
    @NotNull
    @Column(nullable = false)
    private String author;

    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{4}-\\d{3}-\\d{1}")
    private String isbn;

    private int numberOfPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

//    public String getFormattedIsbn() {
//        String formattedIsbn = this.isbn;
//        formattedIsbn = new StringBuffer(formattedIsbn)
//                .insert(3, "-")
//                .insert(6, "-")
//                .insert(11, "-")
//                .insert(15, "-")
//                .toString();
//        return formattedIsbn;
//    }

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
