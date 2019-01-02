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

    public List<Artikel> findAllArtikels()
    {
    return overviewRepository.findAllArtikels();
    }

    public String detailsPaginaSoort(String type)
    {
        switch (type)
        {
            case "lp":
                break;
            case "game":
                break;
            case "fictie":
                break;
            case "nonFictie":
                break;

        }

    }
}
