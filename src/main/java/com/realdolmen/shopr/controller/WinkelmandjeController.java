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
    private Artikel artikel;

    public List<Artikel> getArtikels()
    {
        return artikels;
    }

    public void setArtikels(List<Artikel> artikels)
    {
        this.artikels = artikels;
    }

    public Artikel getArtikel()
    {
        return artikel;
    }

    public void setArtikel(Artikel artikel)
    {
        this.artikel = artikel;
    }

    public void artikelToevoegen(Artikel a)
    {

    }

    public void hoeveelheidArtikel()
    {

    }
}
