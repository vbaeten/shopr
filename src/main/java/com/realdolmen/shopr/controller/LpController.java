package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.LpService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class LpController {

    @Inject
    private LpService lpService;

    private Lp lp = new Lp();


    public Lp findById(int id) {
        return this.lpService.findById(id);
    }

    public List<Lp> findAll() {
        return this.lpService.findAll();
    }

    public void removeById(int id) {
        this.lpService.removeById(id);
    }

    public String save() {
        this.lpService.insert(lp);
        return "articleManagement?faces-redirect=true";
    }

    public String gotoDetails(Lp lp) {
        this.lp = lp;
        return "lpDetails?faces-redirect=true";
    }


    public Lp getLp() {
        return lp;
    }

    public void setLp(Lp lp) {
        this.lp = lp;
    }

}
