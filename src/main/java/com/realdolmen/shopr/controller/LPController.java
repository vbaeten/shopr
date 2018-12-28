package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.service.LPService;

import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@ViewScoped
public class LPController {

    private LP newLp = new LP();

    @Inject
    private LPService service;

    public LP getNewLp() { return newLp; }

    public void setNewLp(LP lp) { this.newLp = lp; }

    public List<LP> getLPs() { return this.service.findAll(); }

    public void submit() { this.service.save(newLp); }
}
