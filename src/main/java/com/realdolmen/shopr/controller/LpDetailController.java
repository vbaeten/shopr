package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.LpService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class LpDetailController {
    private Long id;
    private Lp lp;

    @Inject
    private LpService lpService;

    public void init() {
        lp = lpService.findLpById(id);
    }

    public String delete() {
        lpService.delete(id);
        return "/overview/lps.xhtml?faces-redirect=true";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Lp getLp() {
        return lp;
    }

    public void setLp(Lp lp) {
        this.lp = lp;
    }
}
