package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.io.Serializable;

@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = Game.FIND_BY_TITLE,
                        query = "SELECT g FROM Game g WHERE g.title = :title"
                ),
                @NamedQuery(
                        name = Game.FIND_ALL,
                        query = "SELECT g FROM Game g"
                )
        }
)
public class Game extends Article implements Serializable {

    public static final String FIND_ALL = "Game.findAll";
    public static final String FIND_BY_TITLE = "Game.findByTitle";

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
