package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Fiction extends Book {

    @Column(name = "genre")
    private BookGenre bookGenre;

    //TODO max length 255
    @Column(name = "synopsis")
    private String synopsis;

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
}
