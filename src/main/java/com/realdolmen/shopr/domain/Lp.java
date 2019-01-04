package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
//@Table(name = "lp",
//        uniqueConstraints=@UniqueConstraint(columnNames = {"title", "artist"})
//)
@NamedQueries(
        {
                @NamedQuery(
                        name = Lp.FIND_BY_TITLE,
                        query = "SELECT l FROM Lp l WHERE l.title = :title"
                ),
                @NamedQuery(
                        name = Lp.FIND_ALL,
                        query = "SELECT l FROM Lp l"
                )
        })
public class Lp extends Article {
    public static final String FIND_ALL = "Lp.findAll";
    public static final String FIND_BY_TITLE = "Lp.findByTitle";

    @Size(max=100)
    private String artist;

    @Enumerated(EnumType.STRING)
    private LpGenre genre;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public LpGenre getGenre() {
        return genre;
    }

    public void setGenre(LpGenre genre) {
        this.genre = genre;
    }
}
