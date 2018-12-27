package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.repository.OverviewRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class OverviewService
{
    @Inject
    OverviewRepository overviewRepository;

    public List<Artikel> findAllArtikels()
    {
    return overviewRepository.findAllArtikels();
    }
}
