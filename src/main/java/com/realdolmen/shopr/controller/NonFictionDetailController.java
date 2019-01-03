package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.service.NonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class NonFictionDetailController {
    private Long id;
    private NonFiction nonFiction;

    @Inject
    private NonFictionService nonFictionService;

    public void init() {
        getNonFictionById(id);
    }

    private void getNonFictionById(Long id) {
        nonFiction = nonFictionService.findNonFictionById(id);
    }

    public String delete() {
        nonFictionService.delete(id);
        return "/overview/books.xhtml?faces-redirect=true";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NonFiction getNonFiction() {
        return nonFiction;
    }

    public void setNonFiction(NonFiction nonFiction) {
        this.nonFiction = nonFiction;
    }
}
