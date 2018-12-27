package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "beoordeling")
public class Beoordeling {

    @Id
    @GeneratedValue
    private int id;

    @Min(0)
    @Max(10)
    @Column(name = "score")
    private int score;

    @Column(name = "omschrijving")
    private String omschrijving;

    @Transient
    //@ManyToOne
    private User user;

    @ManyToOne
    private Artikel artikel;

    public int getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }
}
