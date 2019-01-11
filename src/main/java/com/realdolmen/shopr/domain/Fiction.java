package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fiction")
@DiscriminatorValue("fiction")
@NamedQueries(
        {
                @NamedQuery(
                        name = Fiction.FIND_BY_GENRE,
                        query = "SELECT f FROM Fiction f WHERE f.fictionGenre = :fictionGenre"
                ),
                @NamedQuery(
                        name = Fiction.FIND_ALL,
                        query = "SELECT f FROM Fiction f"
                )
        }
)
public class Fiction extends Book {
    public static final String FIND_ALL = "Fiction.findAll";
    public static final String FIND_BY_GENRE = "Fiction.findByGenre";

    @Size(max = 255)
    @Column(name = "short_summary")
    private String shortSummary;

    @Enumerated(EnumType.STRING)
    @Column(name = "fiction_genre")
    private FictionGenre fictionGenre;


    public String getShortSummary() {
        return shortSummary;
    }

    public void setShortSummary(String shortSummary) {
        this.shortSummary = shortSummary;
    }

    public FictionGenre getFictionGenre() {
        return fictionGenre;
    }

    public void setFictionGenre(FictionGenre fictionGenre) {
        this.fictionGenre = fictionGenre;
    }
}
