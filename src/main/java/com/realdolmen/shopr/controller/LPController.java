package com.realdolmen.shopr.controller;

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

    public void initDetailView(Long id) {
        this.lp = lpService.findLPById(id);
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

    public LP getLPbyId(Long id) {
        return lpService.findLPById(id);
    }

    public String saveLP() {
        this.lpService.insert(lp);
        return "overview";
    }

    public String removeLP(LP lp) {
        lpService.removeLPById(lp.getId());
        return "overview";
    }

    public LP getLP() {
        return this.lp;
    }

    public void setLP(LP lp) {
        this.lp = lp;
    }
}
