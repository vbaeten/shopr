package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;

@Entity
@Table(name = "lp")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries(
        value = {
                @NamedQuery(
                        name = Lp.FIND_BY_TITLE,
                        query = "SELECT a FROM Lp a WHERE a.title = :title"
                ),
                @NamedQuery(
                        name = Lp.FIND_ALL,
                        query = "SELECT a FROM Lp a"
                )
        }
)
public class Lp extends Article {
    public static final String FIND_BY_TITLE = "Lp.findByTitle";
    public static final String FIND_ALL = "Lp.FindAll";

    //TODO unique in combination title
    @Max(100)
    @Column(name = "artist")
    private String Artist;

    @Column(name = "genre")
    private MusicGenre musicGenre;

    public String getArtist() {
        return Artist;
    }

    public void setArtist(String artist) {
        Artist = artist;
    }

    public MusicGenre getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(MusicGenre musicGenre) {
        this.musicGenre = musicGenre;
    }
}
