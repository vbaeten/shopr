package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.service.FictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class FictionDetailBean {

    private int id;
    private Fiction fiction;

    @Inject
    private FictionService fictionService;

    public void init() {
        getFictionByID(id);
    }

    public void getFictionByID(int id) {
        fiction = fictionService.findFictionById(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Fiction getFiction() {
        return fiction;
    }

    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }
}
