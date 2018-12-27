package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Max;

@Entity
public class Game extends Article {

    //TODO unique in combination title
    @Max(100)
    @Column(name = "publisher")
    private String publisher;

    @Column(name = "min_age")
    private int minAge;

    @Column(name = "genre")
    private GameGenre gameGenre;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public GameGenre getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(GameGenre gameGenre) {
        this.gameGenre = gameGenre;
    }
}
