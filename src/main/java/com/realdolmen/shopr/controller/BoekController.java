package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Boek;
import com.realdolmen.shopr.domain.Fictie;
import com.realdolmen.shopr.domain.NonFictie;
import com.realdolmen.shopr.domain.TestLombok;
import com.realdolmen.shopr.service.BoekService;
import com.realdolmen.shopr.service.OverviewService;

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

    @Inject
    OverviewService overviewService;

    private List<Boek> boeken = new ArrayList<>();
    private Boek boek;
    private int loadPanelEditBoek;

    private Boek editFictieBoek = new Fictie();
    private Boek editNonFictieBoek = new NonFictie();



    public int getLoadPanelEditBoek()
    {
        return loadPanelEditBoek;
    }

    public void setLoadPanelEditBoek(int loadPanelEditBoek)
    {
        this.loadPanelEditBoek = loadPanelEditBoek;
    }

    public Boek getEditFictieBoek()
    {
        return editFictieBoek;
    }

    public void setEditFictieBoek(Boek editFictieBoek)
    {
        this.editFictieBoek = editFictieBoek;
    }

    public Boek getEditNonFictieBoek()
    {
        return editNonFictieBoek;
    }

    public void setEditNonFictieBoek(Boek editNonFictieBoek)
    {
        this.editNonFictieBoek = editNonFictieBoek;
    }

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

    public void loadpanelEdit(Boek boek)
    {
        this.loadPanelEditBoek = overviewService.detailsPaginaSoort(boek.getType());
        if (loadPanelEditBoek == 3)
        {
            editFictieBoek = boek;
        } else
        {
            editNonFictieBoek = boek;
        }
    }

    public void delete(Boek boek)
    {
        boekService.delete(boek.getId());
    }

    public void update()
    {
        if (loadPanelEditBoek == 3)
        {
            boekService.update(this.editFictieBoek);
        }
        else
        {
            boekService.update(this.editNonFictieBoek);
        }


    }
}
