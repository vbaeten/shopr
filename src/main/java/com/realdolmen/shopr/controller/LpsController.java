package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.LpService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class LpsController {
    @Inject
    private LpService lpService;

    public List<Lp> getLps() {
        return this.lpService.findAllLps();
    }
}
