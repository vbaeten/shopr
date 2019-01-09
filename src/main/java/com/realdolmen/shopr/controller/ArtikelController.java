package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.*;
import com.realdolmen.shopr.service.*;

import javax.annotation.PostConstruct;
import javax.ejb.Init;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.inject.Inject;
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
    private String selectedArtikelType;
    private Game game = new Game();
    private Boek boek;

    @ManagedProperty("#{param.id}")
    private int selectedId;

    private boolean editable;

    public boolean isEditable() {
        return editable;
    }
    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public ArtikelTypes[] getArtikelTypes() {
        return ArtikelTypes.values();
    }

    @PostConstruct
    public void init(){
        System.out.println(selectedId);
    }

//    public void submitSelectedArtikelType(ValueChangeEvent e) {
//        selectedArtikelType = (ArtikelTypes) e.getNewValue();
//    }

    public String selectArtikelTypeButton() {
        switch (selectedArtikelType) {
            case "game":
                return "gameToevoegen?faces-redirect=true";
            case "lp":
                return "lpToevoegen?faces-redirect=true";
            case "fictie":
                return "fictieBoekToevoegen?faces-redirect=true";
            case "nonFictie":
                return "nonFictieBoekToevoegen?faces-redirect=true";
        }
        return null;
    }



    public String gotoDetails(Artikel artikel) {
        this.artikel = artikel;
        if (artikel instanceof Game) {
            return "gameDetails?faces-redirect=true&includeViewParams=true";
        } else if (artikel instanceof Lp) {
            return "lpDetails?faces-redirect=true&includeViewParams=true";
        } else if (artikel instanceof Fictie) {
            return "fictieDetails?faces-redirect=true&includeViewParams=true";
        } else if (artikel instanceof NonFictie) {
            return "nonFictieDetails?faces-redirect=true&includeViewParams=true";
        }
        return null;
    }

//    public Game getGameById(int id) {
//        return this.gameService.findById(id);
//    }

    public Lp getLpById(int id) {
        return this.lpService.findById(id);
    }


    public Artikel getArtikelById(int id) {
        return this.artikelService.findArtikelById(id);
    }

    public String editArtikelById(int id) {
        this.artikel = artikelService.findArtikelById(id);
        this.editable = true;
        return null;
    }

    public String saveArtikelById(int id){
        this.editable = false;
        return null;
    }

    public List<Artikel> getAllArtikels() {
        return this.artikelService.findAllArtikels();
    }

    public String removeArtikelById(int id) {
        if(id == selectedId){
            this.artikelService.removeArtikelById(id);
        }
        return "artikelOverzicht?faces-redirect=true";
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
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

    public String getSelectedArtikelType() {
        return selectedArtikelType;
    }

    public void setSelectedArtikelType(String selectedArtikelType) {
        this.selectedArtikelType = selectedArtikelType;
    }

    public int getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(int selectedId) {
        this.selectedId = selectedId;
    }
}
