package com.realdolmen.shopr.domain;




public abstract class Book extends Article{

    private String Author;
    private String isbn;
    private short totalPages;


    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
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
