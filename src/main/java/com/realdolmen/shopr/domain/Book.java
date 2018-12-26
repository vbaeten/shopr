package com.realdolmen.shopr.domain;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Book extends Article{
    private String author;
    //TODO: validation via regex pattern
    private long isbn;
    private int numberOfPages;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
