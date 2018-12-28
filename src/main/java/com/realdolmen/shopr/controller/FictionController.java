package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.service.FictionService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@ViewScoped
public class FictionController {

    private Fiction newFiction = new Fiction();

    private Fiction selectedItem;

    @Inject
    private FictionService service;

    public Fiction getNewFiction() { return newFiction; }

    public void setNewFiction(Fiction fiction) { this.newFiction = fiction; }

    public List<Fiction> getFictions() { return this.service.findAll(); }

    public void submit() { this.service.save(newFiction); }

    @PostConstruct
    public void init() {
        newFiction.getGenre();
    }

}
