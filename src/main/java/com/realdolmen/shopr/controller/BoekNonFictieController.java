package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.BoekNonFiction;
import com.realdolmen.shopr.service.BoekNonFictieService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;


@Named
@RequestScoped
public class BoekNonFictieController {
    private BoekNonFiction newBoeknonFiction;

    @PostConstruct
    public void prepare() {
        newBoeknonFiction = new BoekNonFiction();
    }

    @Inject
    private BoekNonFictieService boeknonfictieService;

    public BoekNonFiction getNewBoeknonFiction() {
        return newBoeknonFiction;
    }

    public void setNewBoeknonFiction(BoekNonFiction newBoeknonFiction) {
        this.newBoeknonFiction = newBoeknonFiction;
    }

    public List<BoekNonFiction> getBoekNonFiction() {
        return this.boeknonfictieService.findAllNonBoekFictions();
    }


}
