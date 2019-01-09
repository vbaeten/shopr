package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.service.FictionService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@ManagedBean
@ViewScoped
public class FictionController {

    private Fiction newFiction = new Fiction();

    @Inject
    private FictionService service;

    public Fiction getNewFiction() {
        return newFiction;
    }

    public void setNewFiction(Fiction fiction) {
        this.newFiction = fiction;
    }

    public List<Fiction> getFictions() {
        return this.service.findAll();
    }

    public Fiction getFictionById(Long id) {
        return this.service.findById(id);
    }

    public Fiction getFictionByTitle(String title) {
        return this.service.findByTitle(title);
    }

    public void submit() {
        this.service.save(newFiction);
    }
}
