package com.realdolmen.shopr.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "bestellingen")
@Getter
@Setter
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



    public void addArtikel(Artikel a)
    {
        artikels.add(a);
    }
}
