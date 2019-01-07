package com.realdolmen.shopr.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ToevoegController
{

    private int selectPanel = 1;


    public void setSelectPanel(int selectPanel)
    {
     this.selectPanel = selectPanel;

    }

    public int getSelectPanel()
    {
        return this.selectPanel;
    }

}
