package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.domain.NonFictionSubject;
import com.realdolmen.shopr.service.NonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class CuNonFictionController {
    private NonFiction nonFiction;
    private Long id;

    @Inject
    private NonFictionService nonFictionService;

    public void init() {
        if (id == null) {
            nonFiction = new NonFiction();
        } else {
            getNonFictionById(id);
        }
    }

    private void getNonFictionById(Long id) {
        nonFiction = nonFictionService.findNonFictionById(id);
    }

    public String submit() {
        if (id == null) {
            this.nonFictionService.insert(nonFiction);
            nonFiction = new NonFiction();
        } else {
            this.nonFictionService.update(nonFiction);
        }
        return "/overview/books.xhtml?faces-redirect=true";
    }

    public NonFiction getNonFiction() {
        return nonFiction;
    }

    public void setNonFiction(NonFiction nonFiction) {
        this.nonFiction = nonFiction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public NonFictionSubject[] getNonFictionSubjects() {
        return NonFictionSubject.values();
    }
}
