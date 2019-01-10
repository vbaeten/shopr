package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.OverviewService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@ViewScoped
public class OverviewController implements Serializable
{
    @Inject
    OverviewService overviewService;

    @Inject
    UserService userService;


    Artikel artikelSelected = new Artikel();

    private int panelNumber;


    public int getPanelNumber()
    {
        return panelNumber;
    }


    public Artikel getArtikelSelected()
    {
        return artikelSelected;
    }

    public void setArtikelSelected(Artikel artikelSelected)
    {
        this.artikelSelected = artikelSelected;
    }

    public String getNaamPaginaDetail()
    {
        return naamPaginaDetail;
    }

    public void setNaamPaginaDetail(String naamPaginaDetail)
    {
        this.naamPaginaDetail = naamPaginaDetail;
    }

    private String naamPaginaDetail;


    public List<Artikel> artikels()
    {
        return this.overviewService.findAllArtikels();
    }

    public Artikel geselecteerdArtikelDetails(int id)
    {
        return this.artikelSelected = overviewService.findArtikelById(id);



    }
    public void details(Artikel a)
    {

        setArtikelSelected(a);
        this.panelNumber = overviewService.detailsPaginaSoort(a.getType());

    }

    public void addFavoriet(User u)
    {
        userService.addFavoriet(artikelSelected, u);


    }

    public void removeFavoriet(User u)
    {
        userService.removeFavoriet(artikelSelected, u);

    }

    public boolean checkFavoriet(User u)
    {
        return userService.isFavoriet(artikelSelected, u);
    }


}
