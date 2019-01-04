package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.domain.LPGenre;
import com.realdolmen.shopr.service.LPService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class LpDetailController {


    private LP lp;
    private int id;

    @Inject
    LPService lpService;



    public LPGenre[] getGenres() {
        return LPGenre.values();
    }


    public void init(){

            getLpById(id);
    }

    private void getLpById(int id) {
        lp = lpService.findById(id);
    }



    public String delete(){
        lp = this.lpService.findById(id);
        this.lpService.delete(lp);

        return "/overview-pages/lps-overview.xhtml?faces-redirect=true";
    }


    public String update() {

        this.lpService.update(lp);

        return "/overview-pages/lps-overview.xhtml?faces-redirect=true";
    }





    public LP getLp() {
        return lp;
    }

    public void setLp(LP lp) {
        this.lp = lp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
