package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

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
        })
//@Table(name = "game",
//        uniqueConstraints=@UniqueConstraint(columnNames = {"title", "publisher"})
//)
public class Game extends Article {
    public static final String FIND_ALL = "Game.findAll";
    public static final String FIND_BY_TITLE = "Game.findByTitle";

    @Size(max = 100)
    private String publisher;
    private int minimumAge;
    @Enumerated(EnumType.STRING)
    private GameGenre genre;

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

    public GameGenre getGenre() {
        return genre;
    }

    public void setGenre(GameGenre genre) {
        this.genre = genre;
    }
}
