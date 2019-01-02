package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.repository.*;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class OverviewService
{
    public String detailsSoort;

    @Inject
    OverviewRepository overviewRepository;

    @Inject
    GameRepository gameRepository;

    @Inject
    LpRepository lpRepository;

    @Inject
    FictieRepository fictieRepository;

    @Inject
    NonFictieRepository nonFictieRepository;

    public Artikel findArtikelById(int id)
    {
        return overviewRepository.findById(id);
    }

    public List<Artikel> findAllArtikels()
    {
    return overviewRepository.findAllArtikels();
    }

    public String detailsPaginaSoort(String type)
    {
        switch (type)
        {
            case "lp": detailsSoort = "lpdetails";
                break;
            case "game": System.out.println("gamedetailks");
                detailsSoort = "gamedetails";
                break;
            case "fictie": detailsSoort = "fictiedetails";
                break;
            case "nonFictie": detailsSoort = "nonfictiedetails";
                break;

        }
        System.out.println("gamedetailks");
return detailsSoort;
    }
}
