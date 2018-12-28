package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fictie;
import com.realdolmen.shopr.repository.FictieRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FictieService
{
@Inject
    FictieRepository fictieRepository;

    public List<Fictie> findAllFictie()
    {
        return fictieRepository.findAllFictie();
    }

    public Fictie findFictieByTitel(String titel)
    {
        return fictieRepository.findByName(titel);
    }

    public Fictie findFictieById(int id)
    {
        return fictieRepository.findById(id);
    }

    public void insert(Fictie fictie)
    {
        fictieRepository.insert(fictie);
    }

}
