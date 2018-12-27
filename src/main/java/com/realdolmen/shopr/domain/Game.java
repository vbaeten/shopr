package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.GameGenre;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
public class Game extends Article{
    @Column(name = "Publisher")
    @Size(max = 100)
    private String publisher;
    @Column(name = "Minimumage")
    private int minimumAge;
    @Column(name = "Genre")
    private GameGenre gameGenre;

    public Game() {
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public GameGenre getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(GameGenre gameGenre) {
        this.gameGenre = gameGenre;
    }
}
