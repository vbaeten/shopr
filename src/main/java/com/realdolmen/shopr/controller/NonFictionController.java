package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.service.NonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class NonFictionController {

    @Inject
    private NonFictionService nonFictionService;

    private NonFiction nonFiction = new NonFiction();


    public NonFiction findById(int id) {
        return this.nonFictionService.findById(id);
    }

    public List<NonFiction> findAll() {
        return this.nonFictionService.findAll();
    }

    public void removeById(int id) {
        this.nonFictionService.removeById(id);
    }

    public String save() {
        this.nonFictionService.insert(nonFiction);
        return "articleManagement?faces-redirect=true";
    }

    public String gotoDetails(NonFiction nonFiction) {
        this.nonFiction = nonFiction;
        return "nonFictionDetails?faces-redirect=true";
    }


    public NonFiction getNonFiction() {
        return nonFiction;
    }

    public void setNonFiction(NonFiction nonFiction) {
        this.nonFiction = nonFiction;
    }

}
