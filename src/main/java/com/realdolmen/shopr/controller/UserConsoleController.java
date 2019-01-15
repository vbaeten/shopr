package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.ArtikelLijnInBestelling;
import com.realdolmen.shopr.domain.Bestelling;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.BestellingsService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class UserConsoleController
{
    @Inject
    BestellingsService bestellingsService;


    User user;
    private List<Bestelling> bestellingenCurrentUser = new ArrayList<>();
    private boolean detailPanel = false;
    private List<ArtikelLijnInBestelling> artikelLijnInBestelling = new ArrayList<>();
    private List<Artikel> artikels = new ArrayList<>();
    private List<Bestelling> bestellingen = new ArrayList<>();
    private int totaalBedrag;

    public List<Bestelling> getBestellingen()
    {
        return bestellingen;
    }

    public void setBestellingen(List<Bestelling> bestellingen)
    {
        this.bestellingen = bestellingen;
    }

    public List<Artikel> getArtikels()
    {
        return artikels;
    }

    public void setArtikels(List<Artikel> artikels)
    {
        this.artikels = artikels;
    }

    public int getTotaalBedrag()
    {
        return totaalBedrag;
    }

    public void setTotaalBedrag(int totaalBedrag)
    {
        this.totaalBedrag = totaalBedrag;
    }

    public List<ArtikelLijnInBestelling> getArtikelLijnInBestelling()
    {
        return artikelLijnInBestelling;
    }

    public void setArtikelLijnInBestelling(List<ArtikelLijnInBestelling> artikelLijnInBestelling)
    {
        this.artikelLijnInBestelling = artikelLijnInBestelling;
    }

    public boolean isDetailPanel()
    {
        return detailPanel;
    }

    public void setDetailPanel(boolean detailPanel)
    {
        this.detailPanel = detailPanel;
    }

    public List<Bestelling> getBestellingenCurrentUser()
    {
        return bestellingenCurrentUser;
    }

    public void setBestellingenCurrentUser(List<Bestelling> bestellingen)
    {
        this.bestellingenCurrentUser = bestellingen;
    }

    public List<Bestelling> bestellingen()
    {

        return bestellingsService.bestellingenGeladenMetArtikels(user.getId());


    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public String naarUserConsole(User user)
    {
        this.user = user;
        bestellingenCurrentUser = bestellingen();
        return "userConsole";

    }

    public void ArtikelDetails(Bestelling b)
    {

        this.artikelLijnInBestelling = bestellingsService.artikelLijnInBestellingList(b);
        berekenTotaal();

        this.detailPanel = true;

    }

    public void berekenTotaal()
    {
        for (ArtikelLijnInBestelling a : this.artikelLijnInBestelling)
        {
            this.totaalBedrag += a.getTotaalBedragLijn();
        }
    }


}

