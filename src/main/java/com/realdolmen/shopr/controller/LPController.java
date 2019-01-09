package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.domain.LPGenre;
import com.realdolmen.shopr.service.LPService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class LPController {
    private LP newLp = new LP();

    @Inject
    private LPService service;

    public void save() {
        this.service.save(newLp);
        newLp = new LP();
    }


    public LP getNewLp() {
        return newLp;
    }

    public void setNewLp(LP lp) {
        this.newLp = lp;
    }

    public LPGenre[] getLPGenres() {

        return LPGenre.values();
    }

//    public List<LP> getLPs() { return this.service.findAll(); }
//
//    public LP getLPById(Long id) { return this.service.findById(id); }
//
//    public LP getLPByTitle(String title) { return this.service.findByTitle(title); }

}
