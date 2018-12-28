package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.service.ArtikelService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class ArtikelController {

    private Artikel game = new Game();

    private Artikel lp = new Lp();

    private Boek fictieBoek = new Fictie();
    private Artikel fictie = fictieBoek;

    private Artikel nonFictie = new NonFictie();

    @Inject
    private ArtikelService artikelService;

   public Artikel getArtikelById(int id){
       return this.artikelService.findArtikelById(id);
   }

    public List<Artikel> getAllArtikels(){
        return this.artikelService.findAllArtikels();
    }


    public void removeArtikelById (int id){
        this.artikelService.removeArtikelById(id);
    }


    public Artikel getGame() {
        return game;
    }

    public void setGame(Artikel game) {
        this.game = game;
    }

    public Artikel getLp() {
        return lp;
    }

    public void setLp(Artikel lp) {
        this.lp = lp;
    }

    public Artikel getFictie() {
        return fictie;
    }

    public void setFictie(Artikel fictie) {
        this.fictie = fictie;
    }

    public Artikel getNonFictie() {
        return nonFictie;
    }

    public void setNonFictie(Artikel nonFictie) {
        this.nonFictie = nonFictie;
    }










}
