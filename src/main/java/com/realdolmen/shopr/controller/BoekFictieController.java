package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.BoekFiction;
import com.realdolmen.shopr.domain.BoekGenreFictie;
import com.realdolmen.shopr.service.ArtikelService;
import com.realdolmen.shopr.service.BoekFictieService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class BoekFictieController {
    private BoekFiction boekFiction ;

    @ManagedProperty("#{boekfictieId}")
    private int boekfictieId;
    private BoekGenreFictie boekGenreFictie;

    @PostConstruct
    public void prepare(){
        boekFiction = new BoekFiction();
    }

    @Inject
    private BoekFictieService boekfictieService;
    @Inject
    private ArtikelService artikelService;

    public BoekFiction getDetailsBoekFiction() {
        return boekFiction;
    }

    public void setNewBoekFiction(BoekFiction newBoekFiction) {
        this.boekFiction = newBoekFiction;
    }

    public int  getBoekfictieId() {
        return boekfictieId;
    }

    public BoekFiction findById(int id){
        return this.boekfictieService.findById(id);
    }

    public Artikel getById(int id) {
        return this.artikelService.findById(id);
    }

    public String Details(int id)
    {
        this.boekFiction = this.boekfictieService.findById(id);
        return "boekfictiedetails.xhtml";
    }
    public void setBoekfictieId(int boekfictieId) {
        this.boekfictieId = boekfictieId;
    }



    public void remove(int id) {
        this.boekfictieService.removeById(id);
    }
    public String submit(){
        this.boekfictieService.insert(boekFiction);
        return "artikelsview.xhtml";
    }

    public List<BoekFiction> getAllBoekFiction(){
        return this.boekfictieService.findAllBoekFictions();
    }

    public BoekFiction getBoekFiction() {
        return boekFiction;
    }

    public void setBoekFiction(BoekFiction boekFiction) {
        this.boekFiction = boekFiction;
    }

    public BoekGenreFictie[] getBoekGenreFictie() {
        return BoekGenreFictie.values();
    }

    public void setBoekGenreFictie(BoekGenreFictie boekGenreFictie) {
        this.boekGenreFictie = boekGenreFictie;
    }
}