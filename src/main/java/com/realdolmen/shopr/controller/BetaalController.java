package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.ArtikelLijnInBestelling;
import com.realdolmen.shopr.domain.Bestelling;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.BestellingsService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class BetaalController
{
    @Inject
    UserService userService;

    @Inject
    Bestelling bestelling;

    @Inject
    ArtikelLijnInBestelling artikelLijnInBestelling;

    @Inject
    BestellingsService bestellingsService;

    User betalendeUser = new User();

    public User getBetalendeUser()
    {
        return betalendeUser;
    }

    public void setBetalendeUser(User betalendeUser)
    {
        this.betalendeUser = betalendeUser;
    }

    public void  betalingAfronden(List<ArtikelLijnInBestelling> artikelLijnInBestellings, User u)
    {

        bestellingsService.bestellingAanmaken(artikelLijnInBestellings, u);
    }
}
