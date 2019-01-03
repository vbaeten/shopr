package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.service.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@RequestScoped
public class ArtikelController {


    @Inject
    private ArtikelService artikelService;
    @Inject
    private FictieService fictieService;
    @Inject
    private NonFictieService nonFictieService;
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
        this.artikel.setType(artikel.getType());
        if (artikel instanceof Game) {
            return "gameDetails";
        } else if (artikel instanceof Lp) {
            return "lpDetails";
        } else if (artikel instanceof Boek) {
            boek = (Boek) artikel;
            if (boek.getBoekType().equals("fictie")) {
                boek = fictieService.findById(artikel.getId());
                return "fictieDetails";
            } else if (boek.getBoekType().equals("nonFictie")) {
                boek = nonFictieService.findById(artikel.getId());
                return "nonFictieDetails";
            }
        }
        return null;
    }

    public List<String> getGetArtikelTypes() {
        return artikelTypes;
    }


    public List<String> artikelTypes = new ArrayList<String>(Arrays.asList("game","lp","fictie","nonFictie"));

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

    public boolean isGame() {
        return artikel instanceof Game;
    }

    public boolean isLp() {
        return artikel instanceof Lp;
    }

    public boolean isFictie() {
        return artikel instanceof Fictie;
    }

    public boolean isNonFictie() {
        return artikel instanceof NonFictie;
    }

}
