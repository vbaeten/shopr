package com.realdolmen.shopr.domain;

import javax.persistence.*;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@Table(name = "Game")
@DiscriminatorValue("game")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@NamedQueries(
        {
                @NamedQuery(
                        name = Game.FIND_BY_TITEL,
                        query = "SELECT u FROM Game u WHERE u.Titel = :Titel"
                ),
                @NamedQuery(
                        name = Game.FIND_ALL,
                        query = "SELECT u FROM Game u"
                )
        }
)
public class Game extends Artikel{
    public static final String FIND_ALL = "Game.findAll";
    public static final String FIND_BY_TITEL = "Game.findByTitel";

    @Column
    private String Uitgever;
    @Column
    private int MinimumAge;
    @Column
    private String Genre;

    public String getUitgever() {
        return Uitgever;
    }

    public void setUitgever(String uitgever) {
        Uitgever = uitgever;
    }

    public int getMinimumAge() {
        return MinimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        MinimumAge = minimumAge;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}
