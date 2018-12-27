package com.realdolmen.shopr.domain;


import javax.persistence.*;


@Entity
@Table(name="fiction")
public class Fiction extends Book {


    @Enumerated(EnumType.STRING)
    private BookGenre bookGenre;

    private String preview;


    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public String getPreview() {
        return preview;
    }

    public void setPreview(String preview) {
        this.preview = preview;
    }
}
