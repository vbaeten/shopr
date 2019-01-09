package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
public class Beoordeling {
    @Id
    @GeneratedValue
    private long Id;
    private int Score;
    private String Omschrijving;
    @ManyToOne
    private User user;
    @ManyToOne
    private Artikel artikel;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int score) {
        Score = score;
    }

    public String getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        Omschrijving = omschrijving;
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
