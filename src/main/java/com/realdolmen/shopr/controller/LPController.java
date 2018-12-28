package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.domain.LPGenre;
import com.realdolmen.shopr.service.LPService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class LPController {

    private LP newLP = new LP();

    @Inject
    private LPService lpService;



    public LPGenre[] getGenres(){
        return LPGenre.values();
    }


    public List<LP> getLPs(){
        return this.lpService.findAllLps();
    }

    public void submit(){
      this.lpService.insert(newLP);
    }


    public LP getNewLP() {
        return newLP;
    }

    public void setNewLP(LP newLP) {
        this.newLP = newLP;
    }

}
