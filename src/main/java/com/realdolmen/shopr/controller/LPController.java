package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.service.LPService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class LPController {

    private LP newLP = new LP();

    @Inject
    private LPService LPService;



    public void addLP(){
      this.LPService.insert(newLP);
    }


    public LP getNewLP() {
        return newLP;
    }

    public void setNewLP(LP newLP) {
        this.newLP = newLP;
    }

    public LPService getLPService() {
        return LPService;
    }

    public void setLPService(LPService LPService) {
        this.LPService = LPService;
    }



}
