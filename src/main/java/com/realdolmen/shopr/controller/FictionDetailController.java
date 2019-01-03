package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.service.FictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class FictionDetailController {
    private Long id;
    private Fiction fiction;

    @Inject
    private FictionService fictionService;

    public void init() {
        getFictionById(id);
    }

    private void getFictionById(Long id) {
        fiction = fictionService.findFictionById(id);
    }

    public String delete() {
        fictionService.delete(id);
        return "/overview/books.xhtml?faces-redirect=true";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Fiction getFiction() {
        return fiction;
    }

    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }
}
