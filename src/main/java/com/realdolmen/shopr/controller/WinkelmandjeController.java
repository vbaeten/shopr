package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.ArtikelInWinkelMand;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@SessionScoped
@ManagedBean
public class WinkelmandjeController
{

    @Inject
    ArtikelInWinkelMand artikelInWinkelMand;

    private List<ArtikelInWinkelMand> artikelsInMandje = new ArrayList<>();
    private Artikel artikel;
    private int aantalArtikel;
    private int aantalArtikelsTotaal = 0;


    public List<ArtikelInWinkelMand> getArtikelsInMandje()
    {
        return artikelsInMandje;
    }

    public void setArtikelsInMandje(List<ArtikelInWinkelMand> artikelsInMandje)
    {
        this.artikelsInMandje = artikelsInMandje;
    }

    public Artikel getArtikel()
    {
        return artikel;
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
        artikelInWinkelMand = new ArtikelInWinkelMand();
        artikelInWinkelMand.setAantal(aantalArtikel);
        artikelInWinkelMand.setArtikel(a);
        artikelsInMandje.add(artikelInWinkelMand);


    }


}
