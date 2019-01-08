package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.ArtikelLijnInBestelling;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.omnifaces.util.Faces.redirect;

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
    private boolean betaalButtonHide = false ;

    public boolean isBetaalButtonHide()
    {
        return betaalButtonHide;
    }

    public void setBetaalButtonHide(boolean betaalButtonHide)
    {
        this.betaalButtonHide = betaalButtonHide;
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
        boolean legeLijst;
        boolean notFound = true;

        legeLijst = artikelsInMandje.isEmpty();
        betaalButtonHide = !artikelsInMandje.isEmpty();

        if (legeLijst == false)
        {

                for (ArtikelLijnInBestelling al: artikelsInMandje)
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
    private void totaalBestelling()
    {
        totaalBedragBestelling = 0;
        for (ArtikelLijnInBestelling al: artikelsInMandje)
        {
            totaalBedragBestelling += al.getTotaalBedragLijn();
        }

    }

    public void resetWinkelmand()
    {
        artikelsInMandje = new ArrayList<>();
        betaalButtonHide = false;
//        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
//        return "index?faces-redirect=true";
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



