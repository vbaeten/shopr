package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "game"/*, uniqueConstraints = @UniqueConstraint(columnNames = {"uitgever", "titel"})*/)
public class Game extends Artikel {

    @Size(max = 100)
    @Column(name = "uitgever", unique = true)
    private String uitgever;

    @Column(name = "minimum_leeftijd")
    private int minimumLeeftijd;

    @Enumerated(EnumType.STRING)
    private GameGenre gameGenre;

    public String getUitgever() {
        return uitgever;
    }

    public void setUitgever(String uitgever) {
        this.uitgever = uitgever;
    }

    public int getMinimumLeeftijd() {
        return minimumLeeftijd;
    }

    public void setMinimumLeeftijd(int minimumLeeftijd) {
        this.minimumLeeftijd = minimumLeeftijd;
    }

    public GameGenre getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(GameGenre gameGenre) {
        this.gameGenre = gameGenre;
    }
}
