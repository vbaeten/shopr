package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.LpService;

import javax.inject.Inject;
import java.util.List;

public class LpController {
    Lp newLp = new Lp();

    @Inject
    private LpService lpService;

    public Lp getNewLp(){
        return newLp;
    }

    public void setNewLp(Lp lp){
        this.newLp = lp;
    }

    public List<Lp> getLps(){
        return this.lpService.findAllLps();
    }

    public void submit(Lp lp){
        this.lpService.insert(lp);
    }
}
