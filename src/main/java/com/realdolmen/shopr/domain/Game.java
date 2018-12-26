package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "game")
public class Game extends Artikel
{
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
