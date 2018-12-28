package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.service.ArtikelService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class ArtikelController {

    @Inject
    private ArtikelService artikelService;

    public List<Artikel> getArtikels(){
        return this.artikelService.findAllArtikels();
    }

}
