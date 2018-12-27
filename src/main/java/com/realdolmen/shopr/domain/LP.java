package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class LP extends Article {

    //TODO length 100, unique in combination title
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
