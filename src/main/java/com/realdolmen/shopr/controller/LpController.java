package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.service.LpService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class LpController
{
private Lp newLp = new Lp();

@Inject
    LpService lpService;

public Lp getNewLp()
{
    return newLp;
}

public void SetNewLp(Lp newLp)
{
    this.newLp = newLp;
}

public List<Lp> getlps()
{
    return this.lpService.findAllLps();
}

public void submit()
{
    this.lpService.insert(newLp);
}


}
