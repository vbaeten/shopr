package com.realdolmen.shopr.domain;


import javax.persistence.*;

@Entity
@Table(name="Games")
@NamedQueries({
        @NamedQuery(
                name = Game.FIND_ALL,
                query = "SELECT g FROM Game g"
        )
})
public class Game extends Item {

    public static final String FIND_ALL = "Game.findAll";

    private String publisher;
    private short minAge;

    @Enumerated(EnumType.STRING)
    private GameGenre genre;






    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public short getMinAge() {
        return minAge;
    }

    public void setMinAge(short minAge) {
        this.minAge = minAge;
    }

    public GameGenre getGenre() {
        return genre;
    }

    public void setGenre(GameGenre genre) {
        this.genre = genre;
    }
}
