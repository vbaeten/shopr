package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.LpService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class LpController {

    private Lp newLp = new Lp();

    @Inject
    private LpService lpService;

    public Lp getNewLp() {
        return newLp;
    }

    public void setNewLp(Lp newLp) {
        this.newLp = newLp;
    }

    public List<Lp> getLps() {
        return this.lpService.findAllLps();
    }

    public void submitLp() {
        this.lpService.insertLp(newLp);
    }

}
