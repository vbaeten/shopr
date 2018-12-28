package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.service.ArtikelService;
import com.realdolmen.shopr.service.GameService;
import com.realdolmen.shopr.service.LpService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class ArtikelController {


    @Inject
    private ArtikelService artikelService;
    @Inject
    private GameService gameService;
    @Inject
    private LpService lpService;

   public Artikel getArtikelById(int id){
       return this.artikelService.findArtikelById(id);
   }

    public List<Artikel> getAllArtikels(){
        return this.artikelService.findAllArtikels();
    }


    public void removeArtikelById (int id){
        this.artikelService.removeArtikelById(id);
    }











}
