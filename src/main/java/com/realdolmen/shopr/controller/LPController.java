package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.service.LPService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@SessionScoped
public class LPController {

    LP lp = new LP();

    @Inject
    private LPService lpService;

    public LP getLp(){
        return this.lp;
    }

    public LP getLPById(Long id) {
        return lpService.findLPById(id);
    }

    public void setLp(LP lp){
        this.lp = lp;
    }

    public List<LP> getLPS(){
        return this.lpService.findAllLPS();
    }

    public void add(LP lp){
        this.lpService.insert(lp);
    }
}
