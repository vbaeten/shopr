package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;

@Entity
@Table(name = "lp")
@Inheritance(strategy = InheritanceType.JOINED)
public class LP extends Article {

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
