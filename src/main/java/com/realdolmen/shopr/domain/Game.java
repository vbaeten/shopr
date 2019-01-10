package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "game"/*, uniqueConstraints = @UniqueConstraint(columnNames = {"publisher", "title"})*/)
@DiscriminatorValue("game")
@NamedQueries(
        {
                @NamedQuery(
                        name = Game.FIND_BY_GENRE,
                        query = "SELECT g FROM Game g WHERE g.gameGenre = :gameGenre"
                ),
                @NamedQuery(
                        name = Game.FIND_ALL,
                        query = "SELECT g FROM Game g"
                )
        }
)
public class Game extends Article {
    public static final String FIND_ALL = "Game.findAll";
    public static final String FIND_BY_GENRE = "Game.findByGenre";

    @Size(max = 100)
    @Column(name = "publisher", unique = true)
    private String publisher;
    @Column(name = "minimum_age")
    private int minimumAge;

    @Enumerated(EnumType.STRING)
    @Column(name = "game_genre")
    private GameGenre gameGenre;


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
