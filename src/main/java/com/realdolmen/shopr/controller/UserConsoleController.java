package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.ArtikelLijnInBestelling;
import com.realdolmen.shopr.domain.Bestelling;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.BestellingsService;
import com.realdolmen.shopr.service.OverviewService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class UserConsoleController
{
    @Inject
    BestellingsService bestellingsService;


    User user;
    private List<Bestelling> bestellingenCurrentUser = new ArrayList<>();
    private boolean detailPanel = false;
    private ArtikelLijnInBestelling artikelLijnInBestelling;

    public ArtikelLijnInBestelling getArtikelLijnInBestelling()
    {
        return artikelLijnInBestelling;
    }

    public void setArtikelLijnInBestelling(ArtikelLijnInBestelling artikelLijnInBestelling)
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

    public List<Bestelling> bestellingen(User u)
    {
        return bestellingsService.bestellingenUser(u.getId());
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
        bestellingenCurrentUser = bestellingen(user);
        return "userConsole";

    }

    public void ArtikelDetails(Bestelling b)
    {

        bestellingsService.artikelLijnInBestellingList(b);
        this.detailPanel = true;
    }



}

