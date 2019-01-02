package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.domain.LpGenre;
import com.realdolmen.shopr.service.LpService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@ViewScoped
public class LpController {
    Lp newLp = new Lp();
    int lpId;

    @Inject
    private LpService lpService;

    public void init(){
        newLp = getLpById(lpId);
    }

    public Lp getNewLp() {
        return newLp;
    }

    public void setNewLp(Lp lp) {
        this.newLp = lp;
    }

    public List<Lp> getLps() {
        return this.lpService.findAllLps();
    }

    public void submit() {
        this.lpService.insert(newLp);
        newLp = new Lp();
    }

    public Lp getLpById(int id){
        return newLp = lpService.findLpById(id);
    }

    public int getLpId() {
        return lpId;
    }

    public void setLpId(int lpId) {
        this.lpId = lpId;
    }

    public LpGenre[] getLpGenre() {
        return LpGenre.values();
    }


}
