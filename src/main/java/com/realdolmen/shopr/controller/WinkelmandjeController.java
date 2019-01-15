package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.ArtikelLijnInBestelling;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@SessionScoped
@ManagedBean
public class WinkelmandjeController implements Serializable
{

    @Inject
    ArtikelLijnInBestelling artikelLijnInBestelling;

    @Inject
    LoginController loginController;

    private List<ArtikelLijnInBestelling> artikelsInMandje = new ArrayList<>();
    private Artikel artikel;
    private int aantalArtikel;
    private int aantalArtikelsTotaal = 0;
    private int totaalBedragBestelling;
    private boolean betalingsPanel = false;
    private boolean winkelmandButtonsHide = false;

    public boolean isWinkelmandButtonsHide()
    {
        return winkelmandButtonsHide;
    }

    public void setWinkelmandButtonsHide(boolean winkelmandButtonsHide)
    {
        this.winkelmandButtonsHide = winkelmandButtonsHide;
    }

    public boolean isBetalingsPanel()
    {
        return betalingsPanel;
    }

    public void setBetalingsPanel(Boolean b)
    {
        this.betalingsPanel = b;
    }

    public int getTotaalBedragBestelling()
    {
        return totaalBedragBestelling;
    }

    public void setTotaalBedragBestelling(int totaalBedragBestelling)
    {
        this.totaalBedragBestelling = totaalBedragBestelling;
    }

    public List<ArtikelLijnInBestelling> getArtikelsInMandje()
    {
        return artikelsInMandje;
    }

    public void setArtikelsInMandje(List<ArtikelLijnInBestelling> artikelsInMandje)
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
        boolean notFound = true;
        boolean legeLijst = artikelsInMandje.isEmpty();
        winkelmandButtonsHide = !artikelsInMandje.isEmpty();

        if (!legeLijst)
        {

            for (ArtikelLijnInBestelling al : artikelsInMandje)
            {
                if (al.getId() == a.getId())
                {
                    int aantal = al.getAantal() + this.aantalArtikel;
                    al.setAantal(aantal);
                    int totaal = aantal * a.getPrijs();
                    al.setTotaalBedragLijn(totaal);
                    aantalArtikel = 0;
                    notFound = false;
                }
            }


        }
        if ((legeLijst) || (notFound))
        {
            artikelLijnInBestelling = new ArtikelLijnInBestelling();
            artikelLijnInBestelling.setTotaalBedragLijn(a.getPrijs() * aantalArtikel);
            artikelLijnInBestelling.setAantal(aantalArtikel);
            artikelLijnInBestelling.setArtikel(a);
            artikelLijnInBestelling.setId(a.getId());
            artikelsInMandje.add(artikelLijnInBestelling);
            aantalArtikel = 0;
        }
        totaalBestelling();

    }

    public void artikelToevoegenPerStuk(Artikel a)
    {
        boolean notFound = true;
        boolean legeLijst = artikelsInMandje.isEmpty();
        winkelmandButtonsHide = !artikelsInMandje.isEmpty();

        if (!legeLijst)
        {

            for (ArtikelLijnInBestelling al : artikelsInMandje)
            {
                if (al.getId() == a.getId())
                {
                    int aantal = al.getAantal() + 1;
                    al.setAantal(aantal);
                    int totaal = aantal * a.getPrijs();
                    al.setTotaalBedragLijn(totaal);
                    aantalArtikel = 0;
                    notFound = false;
                }
            }


        }
        if ((legeLijst) || (notFound))
        {
            artikelLijnInBestelling = new ArtikelLijnInBestelling();
            artikelLijnInBestelling.setTotaalBedragLijn(a.getPrijs());
            artikelLijnInBestelling.setAantal(1);
            artikelLijnInBestelling.setArtikel(a);
            artikelLijnInBestelling.setId(a.getId());
            artikelsInMandje.add(artikelLijnInBestelling);
            aantalArtikel = 0;
        }
        totaalBestelling();

    }

    private void totaalBestelling()
    {
        totaalBedragBestelling = 0;
        for (ArtikelLijnInBestelling al : artikelsInMandje)
        {
            totaalBedragBestelling += al.getTotaalBedragLijn();
        }

    }

    public void resetWinkelmand()
    {
        artikelsInMandje = new ArrayList<>();
        winkelmandButtonsHide = false;
        totaalBedragBestelling = 0;

    }

    public void betaalPaneel()
    {
        if (artikelsInMandje.isEmpty())
        {
            betalingsPanel = false;
        }
        betalingsPanel = true;
        loginController.getCurrentUserName();


    }


}



