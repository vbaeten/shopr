package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.domain.FictionGenre;
import com.realdolmen.shopr.service.FictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class CuFictionController {
    private Fiction fiction;
    private Long id;

    @Inject
    private FictionService fictionService;

    public void init() {
        if (id == null) {
            fiction = new Fiction();
        } else {
            getFictionById(id);
        }
    }

    private void getFictionById(Long id) {
        fiction = fictionService.findFictionById(id);
    }

    public String submit() {
        if (id == null) {
            this.fictionService.insert(fiction);
            fiction = new Fiction();
        } else {
            this.fictionService.update(fiction);
        }
        return "/overview/books.xhtml?faces-redirect=true";
    }

    public Fiction getFiction() {
        return fiction;
    }

    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FictionGenre[] getFictionGenres() {
        return FictionGenre.values();
    }
}
