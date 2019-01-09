package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "fiction")
@DiscriminatorValue("fiction")
public class Fiction extends Book {

    @Enumerated
    private Book_Genre genre;

    @Column(length = 255)
    private String summary;

    public Fiction() {
    }

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
