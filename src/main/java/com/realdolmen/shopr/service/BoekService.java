package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Beoordeling;
import com.realdolmen.shopr.domain.Boek;
import com.realdolmen.shopr.repository.BoekRepository;
import com.realdolmen.shopr.repository.OverviewRepository;
import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class BoekService
{
    @Inject
    BoekRepository boekRepository;

    @Inject
    RatingRepository ratingRepository;

    @Inject
    OverviewRepository overviewRepository;

    public List<Boek> findAllBooks()
    {
        return boekRepository.findAllBooks();
    }

    public void update(Boek boek)
    {
        boekRepository.update(boek);
    }

    public void delete(int id)
    {
        for (Beoordeling b : ratingRepository.findBeoordelingenBepaaldArtikel(overviewRepository.findById(id).getId()))
        {
            ratingRepository.delete(b);
        }
        Boek boek = boekRepository.findById(id);
        boekRepository.delete(boek);
    }


}
