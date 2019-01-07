package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@ManagedBean
public class WinkelmandjeController
{


    private List<Artikel> artikels = new ArrayList<>();
    private Artikel artikelGeselecteerd;
    private int aantalArtikel;
    private int aantalArtikelsTotaal = 0;

    public List<Artikel> getArtikels()
    {
        return artikels;
    }

    public void setArtikels(List<Artikel> artikels)
    {
        this.artikels = artikels;
    }

    public Artikel getArtikelGeselecteerd()
    {
        return artikelGeselecteerd;
    }


    public int getAantalArtikel()
    {
        return aantalArtikel;
    }

    public void setAantalArtikel(int aantalArtikel)
    {
        this.aantalArtikel = aantalArtikel;
        aantalArtikelsTotaal += aantalArtikelsTotaal;
    }

    public int getAantalArtikelsTotaal()
    {
        return aantalArtikelsTotaal;
    }

    public void setAantalArtikelsTotaal(int aantalArtikelsTotaal)
    {
        this.aantalArtikelsTotaal = aantalArtikelsTotaal;
    }

    public void artikelToevoegen(Artikel a)
    {
        artikelGeselecteerd = new Artikel();
        artikelGeselecteerd = a;
        artikels.add(a);

    }


}
