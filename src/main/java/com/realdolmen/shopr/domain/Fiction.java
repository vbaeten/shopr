package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "fiction")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Fiction extends Book {

    private Book_Genre genre;

    @Column(length = 255, name = "summary")
    private String summary;

    public Book_Genre getGenre() {
        return genre;
    }

    public void setGenre(Book_Genre bookGenre) {
        this.genre = bookGenre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
