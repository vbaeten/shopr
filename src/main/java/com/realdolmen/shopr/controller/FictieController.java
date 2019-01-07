package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fictie;
import com.realdolmen.shopr.service.FictieService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class FictieController {

    private Fictie fictie = new Fictie();

    @Inject
    private FictieService fictieService;

    public String gotoDetails(Fictie fictie) {
        this.fictie = fictie;
        return "fictieDetails?faces-redirect=true";
    }

    public Fictie getFictie() {
        return fictie;
    }

    public void setFictie(Fictie fictie) {
        this.fictie = fictie;
    }

    public Fictie findById(int id) {
        return this.fictieService.findById(id);
    }

    public List<Fictie> findAll() {
        return this.fictieService.findAll();
    }

    public void removeById(int id) {
        this.fictieService.removeById(id);
    }

    public String save() {
        this.fictieService.insert(fictie);
        return "artikelBeheer?faces-redirect=true";
    }

}
