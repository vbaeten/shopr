package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.domain.enums.LPMusicGenre;
import com.realdolmen.shopr.service.LPService;
import com.realdolmen.shopr.util.ShoprEndpoints;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
@ManagedBean
@ViewScoped
public class LPController {

    @Inject
    private LPService lpService;
    private LP lp = new LP();

    public void initDetailView(Long articleId) {
        this.lp = lpService.findByPrimaryKey(articleId);
    }

    public List<LP> getLPs() {
        return this.lpService.findAll();
    }

    public List<LPMusicGenre> getLPGenres() {
        return Arrays.asList(LPMusicGenre.values());
    }

    public void add(LP lp) {
        this.lpService.insert(lp);
    }

    public String update(LP lp) {this.lpService.update(lp);
        return  ShoprEndpoints.OVERVIEW + "?faces-redirect=true";
    }

    public LP getLPbyId(Long articleId) {
        return lpService.findByPrimaryKey(articleId);
    }

    public String saveLP() {
        this.lpService.insert(lp);
        return ShoprEndpoints.OVERVIEW;
    }

    public String removeLP(LP lp) {
        lpService.remove(lp);
        return ShoprEndpoints.OVERVIEW;
    }

    public LP getLP() {
        return this.lp;
    }

    public void setLP(LP lp) {
        this.lp = lp;
    }
}
