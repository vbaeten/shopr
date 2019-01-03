package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.LpService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class LpsController {
    @Inject
    private LpService lpService;

    public List<Lp> getLps() {
        return this.lpService.findAllLps();
    }
}
