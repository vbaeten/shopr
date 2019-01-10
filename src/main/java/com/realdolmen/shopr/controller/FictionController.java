package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.service.FictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class FictionController {

    @Inject
    private FictionService fictionService;

    private Fiction fiction = new Fiction();


    public Fiction findById(int id) {
        return this.fictionService.findById(id);
    }

    public List<Fiction> findAll() {
        return this.fictionService.findAll();
    }

    public void removeById(int id) {
        this.fictionService.removeById(id);
    }

    public String save() {
        this.fictionService.insert(fiction);
        return "articleManagement?faces-redirect=true";
    }

    public String gotoDetails(Fiction fiction) {
        this.fiction = fiction;
        return "fictionDetails?faces-redirect=true";
    }


    public Fiction getFiction() {
        return fiction;
    }

    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }

}
