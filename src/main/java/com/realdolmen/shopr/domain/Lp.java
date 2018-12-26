package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "lp")
@NamedQueries(
        {
                @NamedQuery(
                        name = Lp.FIND_BY_NAME,
                        query = "SELECT l FROM Lp l WHERE l.name = :name"
                ),
                @NamedQuery(
                        name = Lp.FIND_ALL,
                        query = "SELECT l FROM Lp l"
                )
        })
@Inheritance(strategy = InheritanceType.JOINED)
public class Lp extends Article {
    public static final String FIND_ALL = "Lp.findAll";
    public static final String FIND_BY_NAME = "Lp.findByName";

    //TODO: primary combined key artist + id
    private String artist;
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
