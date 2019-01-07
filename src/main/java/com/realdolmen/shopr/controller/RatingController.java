package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.Beoordeling;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.RatingService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class RatingController
{
    @Inject
    RatingService ratingService;

    @Inject
    LoginController loginController;

    Artikel reivewArtikel = new Artikel();
    Beoordeling beoordeling = new Beoordeling();
    List<Beoordeling> beoordelingslijstBepaaldArtikel = new ArrayList<>();


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
        beoordeling.setUser(loginController.getCurrentUser());
        beoordeling.setArtikel(reivewArtikel);
        ratingService.insert(this.beoordeling);
    }

    public void beoordelingenGeselecteerdAtikelOphalen(int id)
    {
        this.beoordelingslijstBepaaldArtikel = ratingService.beoordelingenBepaaldArtikel(id);
    }

}
