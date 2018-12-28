package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "fictie")
@NamedQueries(
        {
                @NamedQuery(
                        name = Fictie.FIND_BY_GENRE,
                        query = "SELECT f FROM Fictie f WHERE f.fictieGenre = :fictieGenre"
                ),
                @NamedQuery(
                        name = Fictie.FIND_ALL,
                        query = "SELECT f FROM Fictie f"
                )
        }
)
public class Fictie extends Boek {
    public static final String FIND_ALL = "Fictie.findAll";
    public static final String FIND_BY_GENRE = "Fictie.findByGenre";

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
