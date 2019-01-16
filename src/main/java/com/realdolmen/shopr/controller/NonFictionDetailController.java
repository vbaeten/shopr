package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.service.NonFictionService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class NonFictionDetailController {
    private Long id;
    private NonFiction nonFiction;

    @Inject
    private NonFictionService nonFictionService;

    public void init() {
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
