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

    @Inject
    LpService lpService;

    private Lp newLp = new Lp();
    private boolean loadPanel;
    private Lp editLp = new Lp();

    public Lp getEditLp()
    {
        return editLp;
    }

    public void setEditLp(Lp editLp)
    {
        this.editLp = editLp;
    }

    public boolean getLoadPanel()
    {
        return loadPanel;
    }

    public void setLoadPanel(Boolean b)
    {
        this.loadPanel = b;
    }

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

public void deleteLp()
{

}

public void update()
{
lpService.update(this.editLp);
}

public void booleanAndLpPanelLp(Lp lp)
{
    this.loadPanel = true;
    this.editLp = lp;
}

}
