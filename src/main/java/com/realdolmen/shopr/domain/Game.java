package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@NamedQueries({
        @NamedQuery(name = Game.FIND_ALL,
                query = "select g from Game g"),
@NamedQuery(name= Game.FIND_BY_NAME,
query = "select g from Game g where g.titel=:titel")})

@Table(name = "game")
public class Game extends Artikel
{

    public static final String FIND_ALL = "Game.findAll";
    public static final String FIND_BY_NAME = "Game.findByTitel";


    @Size(max = 100)
    @Column
    private String uitgever;
    @Column
    private int minLeeftijd;
    @Column
    EnumGameGenre enumGameGenre;

    public String getUitgever()
    {
        return uitgever;
    }

    public void setUitgever(String uitgever)
    {
        this.uitgever = uitgever;
    }

    public int getMinLeeftijd()
    {
        return minLeeftijd;
    }

    public void setMinLeeftijd(int minLeeftijd)
    {
        this.minLeeftijd = minLeeftijd;
    }

    public EnumGameGenre getEnumGameGenre()
    {
        return enumGameGenre;
    }

    public void setEnumGameGenre(EnumGameGenre enumGameGenre)
    {
        this.enumGameGenre = enumGameGenre;
    }
}
