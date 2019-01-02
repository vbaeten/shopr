package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.service.OverviewService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class OverviewController
{
@Inject
    OverviewService overviewService;

public List<Artikel> artikels()
{
    return this.overviewService.findAllArtikels();
}

public void details()
{

}


}
