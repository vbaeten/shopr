package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bestellingen")
public class Bestelling
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private Calendar bestelDatum;

    @OneToMany
    private List<Artikel> artikels = new ArrayList<>();
    @ManyToOne
    User user;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Calendar getBestelDatum()
    {
        return bestelDatum;
    }

    public void setBestelDatum(Calendar bestelDatum)
    {
        this.bestelDatum = bestelDatum;
    }

    public List<Artikel> getArtikels()
    {
        return artikels;
    }

    public void setArtikels(List<Artikel> artikels)
    {
        this.artikels = artikels;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public void addArtikel(Artikel a)
    {
        artikels.add(a);
    }
}
