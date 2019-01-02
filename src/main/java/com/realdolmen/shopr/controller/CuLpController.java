package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.domain.LpGenre;
import com.realdolmen.shopr.service.LpService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class CuLpController {
    private Lp newLp;
    private Long id;
    private LpGenre[] lpGenres;

    @Inject
    private LpService lpService;

    public void init() {
        if (id == null) {
            newLp = new Lp();
        } else {
            getLpById(id);
        }
    }

    private void getLpById(Long id) {
        newLp = lpService.findLpById(id);
    }

    public String submit() {
        if (id == null) {
            this.lpService.insert(newLp);
            newLp = new Lp();
            return "/overview/lps.xhtml?faces-redirect=true";
        } else {
            this.lpService.update(newLp);
            return "/overview/lps.xhtml?faces-redirect=true";
        }
    }

    public Lp getNewLp() {
        return newLp;
    }

    public void setNewLp(Lp newLp) {
        this.newLp = newLp;
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
