package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFictie;
import com.realdolmen.shopr.service.NonFictieService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class NonFictieController
{
@Inject
    NonFictieService nonFictieService;

    private NonFictie newNonFictie = new NonFictie();

    public NonFictie getNewNonFictie()
    {
        return this.newNonFictie;
    }

    public List<NonFictie> getGames()
    {
        return this.nonFictieService.findAllNonFictie();
    }

    public void setNewNonFictie(NonFictie newNonFictie)
    {
        this.newNonFictie = newNonFictie;
    }

    public void submit()
    {
        this.nonFictieService.insert(newNonFictie);
    }


}
