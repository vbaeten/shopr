package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.LpService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class LpDetailBean {

    private int id;
    private Lp lp;

    @Inject
    private LpService lpService;

    public void init() {
        getLpById(id);
    }

    private void getLpById(int id) {
        lp = lpService.findLpById(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lp getLp() {
        return lp;
    }

    public void setLp(Lp lp) {
        this.lp = lp;
    }
}
