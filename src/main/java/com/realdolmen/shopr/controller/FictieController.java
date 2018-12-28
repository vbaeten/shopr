package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fictie;
import com.realdolmen.shopr.service.FictieService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class FictieController
{

    @Inject
    FictieService fictieService;

    private Fictie newFictie = new Fictie();

    public Fictie getNewFictie()
    {
        return this.newFictie;
    }

    public List<Fictie> getGames()
    {
        return this.fictieService.findAllFictie();
    }

    public void setNewFictie(Fictie newFictie)
    {
        this.newFictie = newFictie;
    }

    public void submit()
    {
        this.fictieService.insert(newFictie);
    }


}
