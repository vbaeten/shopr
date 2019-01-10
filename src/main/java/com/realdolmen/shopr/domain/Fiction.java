package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("FICTION")
@NamedQueries(
        {
                @NamedQuery(
                        name = Fiction.FIND_BY_TITLE,
                        query = "SELECT f FROM Fiction f WHERE f.title = :title"
                ),
                @NamedQuery(
                        name = Fiction.FIND_ALL,
                        query = "SELECT f FROM Fiction f order by f.title"
                )
        })
public class Fiction extends Book {
    public static final String FIND_ALL = "Fiction.findAll";
    public static final String FIND_BY_TITLE = "Fiction.findByTitle";

    @Enumerated(EnumType.STRING)
    private FictionGenre genre;

    @Size(max = 255)
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
