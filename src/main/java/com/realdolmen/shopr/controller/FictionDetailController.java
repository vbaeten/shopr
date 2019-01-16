package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.service.FictionService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class FictionDetailController {
    private Long id;
    private Fiction fiction;

    @Inject
    private FictionService fictionService;

    public void init() {
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
