package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fictie")
public class Fictie extends Boek {

    @Size(max = 255)
    @Column(name = "korte_inhoud")
    private String korteInhoud;

    @Enumerated(EnumType.STRING)
    private FictieGenre fictieGenre;

    public String getKorteInhoud() {
        return korteInhoud;
    }

    public void setKorteInhoud(String korteInhoud) {
        this.korteInhoud = korteInhoud;
    }

    public FictieGenre getFictieGenre() {
        return fictieGenre;
    }

    public void setFictieGenre(FictieGenre fictieGenre) {
        this.fictieGenre = fictieGenre;
    }
}
