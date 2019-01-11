package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.domain.enums.LPMusicGenre;
import com.realdolmen.shopr.service.LPService;
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
        this.lp = lpService.findLPByArticleId(articleId);
    }

    public List<LP> getLPs() {
        return this.lpService.findAllLPS();
    }

    public List<LPMusicGenre> getLPGenres() {
        return Arrays.asList(LPMusicGenre.values());
    }

    public void add(LP lp) {
        this.lpService.insert(lp);
    }

    public String update(LP lp) {this.lpService.update(lp);
        return "overview.xhtml?faces-redirect=true";
    }

    public LP getLPbyId(Long articleId) {
        return lpService.findLPByArticleId(articleId);
    }

    public String saveLP() {
        this.lpService.insert(lp);
        return "overview";
    }

    public String removeLP(LP lp) {
        lpService.removeLPByArticleId(lp.getArticleId());
        return "overview";
    }

    public LP getLP() {
        return this.lp;
    }

    public void setLP(LP lp) {
        this.lp = lp;
    }
}
