package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.BoekFiction;
import com.realdolmen.shopr.service.BoekFictieService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class BoekFictieController {
    private BoekFiction newBoekFiction ;
    @PostConstruct
    public void prepare(){
        newBoekFiction = new BoekFiction();
    }

    @Inject
    private BoekFictieService boekfictieService;

    public BoekFiction getNewBoekFiction() {
        return newBoekFiction;
    }

    public void setNewBoekFiction(BoekFiction newBoekFiction) {
        this.newBoekFiction = newBoekFiction;
    }

    public List<BoekFiction> getBoekFiction(){
        return this.boekfictieService.findAllBoekFictions();
    }


}