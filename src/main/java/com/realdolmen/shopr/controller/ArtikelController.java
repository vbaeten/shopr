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
    private int id;
    private Artikel artikel;
    private Game game;
    private Boek boek;


    public String gotoDetails(Artikel artikel) {
        this.artikel = artikel;
        if (artikel instanceof Game) {
            return "gameDetails";
        } else if (artikel instanceof Lp) {
            return "lpDetails";
        } else if (artikel.getType().equals("fictie")) {
            return "fictieDetails";
        } else if (artikel.getType().equals("nonFictie")) {
            return "nonFictieDetails";
        }
        return null;
    }


    public Game getGameById(int id) {
        return this.gameService.findById(id);
    }

    public Lp getLpById(int id) {
        return this.lpService.findById(id);
    }


    public Artikel getArtikelById(int id) {
        return this.artikelService.findArtikelById(id);
    }

    public List<Artikel> getAllArtikels() {
        return this.artikelService.findAllArtikels();
    }

    public void removeArtikelById(int id) {
        this.artikelService.removeArtikelById(id);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public Boek getBoek() {
        return boek;
    }

    public void setBoek(Boek boek) {
        this.boek = boek;
    }
}
