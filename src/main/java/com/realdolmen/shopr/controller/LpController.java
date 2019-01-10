package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.LpService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class LpController {
    private Lp newLp ;
    @PostConstruct
    public void prepare(){
        newLp = new Lp();
    }

    @Inject
    private LpService lpService;

    public Lp getNewLp() {
        return newLp;
    }

    public void setNewLp(Lp newLp) {
        this.newLp = newLp;
    }

    public List<Lp> getLp(){
        return this.lpService.findAll();
    }


}