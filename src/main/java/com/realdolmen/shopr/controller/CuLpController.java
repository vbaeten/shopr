package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.domain.LpGenre;
import com.realdolmen.shopr.service.LpService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class CuLpController {
    private Lp lp;
    private Long id;

    @Inject
    private LpService lpService;

    public void init() {
        if (id == null) {
            lp = new Lp();
        } else {
            getLpById(id);
        }
    }

    private void getLpById(Long id) {
        lp = lpService.findLpById(id);
    }

    public String submit() {
        if (id == null) {
            this.lpService.insert(lp);
            lp = new Lp();
        } else {
            this.lpService.update(lp);
        }
        return "/overview/lps.xhtml?faces-redirect=true";
    }

    public Lp getLp() {
        return lp;
    }

    public void setLp(Lp lp) {
        this.lp = lp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LpGenre[] getLpGenres() {
        return LpGenre.values();
    }
}
