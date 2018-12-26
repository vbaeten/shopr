package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Fiction extends Book {
    private FictionGenre genre;
    private String summary;

    public FictionGenre getGenre() {
        return genre;
    }

    public void setGenre(FictionGenre genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
