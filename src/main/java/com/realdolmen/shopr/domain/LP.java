package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.LPMusicGenre;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class LP extends Article {
    @Size(max = 100)
    @Column
    private String artist;
    @Column
    private LPMusicGenre LPMusicGenre;

    public LP() {
    }

    public LP(String title, BigDecimal price, String supplierId, String artist, com.realdolmen.shopr.domain.enums.LPMusicGenre LPMusicGenre) {
        super(title, price, supplierId);
        this.artist = artist;
        this.LPMusicGenre = LPMusicGenre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public com.realdolmen.shopr.domain.enums.LPMusicGenre getLPMusicGenre() {
        return LPMusicGenre;
    }

    public void setLPMusicGenre(com.realdolmen.shopr.domain.enums.LPMusicGenre LPMusicGenre) {
        this.LPMusicGenre = LPMusicGenre;
    }
}
