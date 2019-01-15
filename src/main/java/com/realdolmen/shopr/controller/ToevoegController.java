package com.realdolmen.shopr.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ToevoegController
{

    private int selectPanel = 1;
    private boolean gamePanel=false;
    private boolean lpPanel=false;
    private boolean boekPanel= false;


    public boolean isBoekPanel()
    {
        return boekPanel;
    }

    public void setBoekPanel(boolean boekPanel)
    {
        this.boekPanel = boekPanel;
    }

    public boolean isGamePanel()
    {
        return gamePanel;
    }

    public void setGamePanel(boolean gamePanel)
    {
        this.gamePanel = gamePanel;
        this.lpPanel = false;
    }

    public boolean isLpPanel()
    {
        return lpPanel;
    }

    public void setLpPanel(boolean lpPanel)
    {
        this.lpPanel = lpPanel;
        this.gamePanel = false;
    }

    public void setSelectPanel(int selectPanel)
    {
     this.selectPanel = selectPanel;

    }

    public int getSelectPanel()
    {
        return this.selectPanel;
    }



}
