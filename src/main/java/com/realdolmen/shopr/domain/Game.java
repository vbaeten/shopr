package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = Game.FIND_ALL,
                        query = "SELECT g FROM Game g"
                )
        }
)
@DiscriminatorValue("Game")
public class Game extends Item {
    public static final String FIND_ALL = "Game.findAll";

    private String publisher;
    @Column(name = "min_age")
    private Integer minAge;
    @Enumerated(EnumType.STRING)
    @Column(name = "game_genre")
    private GameGenre gameGenre;

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Integer getMinAge() {
        return minAge;
    }

    public void setMinAge(Integer minAge) {
        this.minAge = minAge;
    }

    public GameGenre getGameGenre() {
        return gameGenre;
    }

    public void setGameGenre(GameGenre gameGenre) {
        this.gameGenre = gameGenre;
    }
}
