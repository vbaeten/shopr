package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.service.OverviewService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class EditController
{
    @Inject
    OverviewService overviewService;

   private  int selectPanel = 1;

    public int getSelectPanel()
    {
        return selectPanel;
    }

    public void setSelectPanel(int selectPanel)
    {
        this.selectPanel = selectPanel;
    }


}
