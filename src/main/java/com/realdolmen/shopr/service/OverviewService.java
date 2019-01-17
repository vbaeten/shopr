package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.repository.*;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class OverviewService
{
    private int detailsSoort;

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

    public int getDetailsSoort()
    {
        return detailsSoort;
    }

    public void setDetailsSoort(int detailsSoort)
    {
        this.detailsSoort = detailsSoort;
    }

    public Artikel findArtikelById(int id)
    {
        return overviewRepository.findById(id);
    }

    public List<Artikel> findAllArtikels()
    {
        return overviewRepository.findAllArtikels();
    }

    public int detailsPaginaSoort(String type)
    {
        switch (type)
        {
            case "lp":
                detailsSoort = 1;
                break;
            case "game":
                detailsSoort = 2;
                break;
            case "fictie":
                detailsSoort = 3;
                break;
            case "nonFictie":
                detailsSoort = 4;
                break;
                default:
                    detailsSoort = 1;


        }

        return detailsSoort;
    }



}
