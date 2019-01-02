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
        System.out.println("artikels ophalen");
        return this.overviewService.findAllArtikels();
    }

    public String details(Artikel a)
    {
        System.out.println("detailspagina");
//        artikelSelected = overviewService.findArtikelById(a.getId());

        System.out.println("detailspagina" + artikelSelected.getTitel());
        System.out.println(artikelSelected.getType());
        setNaamPaginaDetail(overviewService.detailsPaginaSoort(a.getType()));

        System.out.println("#################################################" + a.getType());
        return "/lpdetails.xhtml?faces-redirect=true&id=" + a.getId();

    }


}
