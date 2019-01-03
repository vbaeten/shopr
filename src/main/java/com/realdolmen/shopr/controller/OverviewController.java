package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.service.OverviewService;

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

    Artikel artikelSelected = new Artikel();

    public int getPanelNumber()
    {
        return panelNumber;
    }

    private int panelNumber;


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

    public void details(Artikel a)
    {
//        artikelSelected = overviewService.findArtikelById(a.getId());
        setArtikelSelected(a);
        this.panelNumber = overviewService.detailsPaginaSoort(a.getType());


//       return "/details.xhtml?faces-redirect=true&id=" + a.getId();

    }


}
