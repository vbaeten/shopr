package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.Beoordeling;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.OverviewService;
import com.realdolmen.shopr.service.RatingService;
import com.realdolmen.shopr.service.UserService;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class RatingController
{
    @Inject
    RatingService ratingService;

    @Inject
    UserService userService;

    @Inject
    LoginController loginController;

    @Inject
    OverviewService overviewService;



    Artikel reivewArtikel = new Artikel();
    Beoordeling beoordeling= new Beoordeling();
    List<Beoordeling> beoordelingslijstBepaaldArtikel = new ArrayList<>();
    User currentuser;



    public User getCurrentuser()
    {
        return currentuser;
    }

    public void setCurrentuser(User currentuser)
    {
        this.currentuser = currentuser;
    }

    public List<Beoordeling> getBeoordelingslijstBepaaldArtikel()
    {
        return beoordelingslijstBepaaldArtikel;
    }

    public void setBeoordelingslijstBepaaldArtikel(List<Beoordeling> beoordelingslijstBepaaldArtikel)
    {
        this.beoordelingslijstBepaaldArtikel = beoordelingslijstBepaaldArtikel;
    }

    public Beoordeling getBeoordeling()
    {
        return beoordeling;
    }

    public void setBeoordeling(Beoordeling beoordeling)
    {
        this.beoordeling = beoordeling;
    }

    public Artikel getReivewArtikel()
    {
        return reivewArtikel;
    }

    public void setReivewArtikel(Artikel reivewArtikel)
    {
        this.reivewArtikel = reivewArtikel;
    }

    public List<Beoordeling> getAllBeoordelingen()
    {
        return ratingService.findAllBeoordelingen();
    }

    public void addBeoordeling()
    {
        User user = userService.findUserById(11);
        beoordeling.setUser(user);
        beoordeling.setArtikel(reivewArtikel);
        ratingService.insert(this.beoordeling);
    }

    public void beoordelingenGeselecteerdAtikelOphalen(int id)
    {
        this.beoordelingslijstBepaaldArtikel = ratingService.beoordelingenBepaaldArtikel(id);

        this.setReivewArtikel(overviewService.findArtikelById(id));
    }


}