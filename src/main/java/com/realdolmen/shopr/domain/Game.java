package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "game"/*, uniqueConstraints = @UniqueConstraint(columnNames = {"uitgever", "titel"})*/)
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
public class Game extends Artikel {
    public static final String FIND_ALL = "Game.findAll";
    public static final String FIND_BY_GENRE = "Game.findByGenre";

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
