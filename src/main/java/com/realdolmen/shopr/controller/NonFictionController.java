package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.service.NonFictionService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@ManagedBean
@ViewScoped
public class NonFictionController {

    private NonFiction newNonFiction = new NonFiction();

    private NonFiction SelectedItem;

    @Inject
    private NonFictionService service;

    public NonFiction getNewNonFiction() { return newNonFiction; }

    public void setNewNonFiction(NonFiction nonFiction) { this.newNonFiction = nonFiction; }

    public List<NonFiction> getNonFictions() {
        return this.service.findAll();
    }

    public NonFiction getNonFictionById(Long id) { return this.service.findById(id); }

    public NonFiction getNonFictionByTitle(String title) { return this.service.findByTitle(title); }

    public void submit() { this.service.save(newNonFiction); }

    @PostConstruct
    public void init() {
        newNonFiction.getSubject();
    }

}
