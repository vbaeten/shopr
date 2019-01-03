package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Boek;
import com.realdolmen.shopr.service.BoekService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class BoekController
{
    @Inject
    BoekService boekService;

private List<Boek> boeken = new ArrayList<>();
private Boek boek;

    public List<Boek> getBoeken()
    {
        return boeken;
    }

    public void setBoeken(List<Boek> boeken)
    {
        this.boeken = boeken;
    }

    public Boek getBoek()
    {
        return boek;
    }

    public void setBoek(Boek boek)
    {
        this.boek = boek;
    }
    public List<Boek> boeken()
    {
        return this.boekService.findAllBooks();
    }
}
