package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.NonFictie;
import com.realdolmen.shopr.repository.NonFictieRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class NonFictieService
{
@Inject
    NonFictieRepository nonFictieRepository;

    public List<NonFictie> findAllNonFictie()
    {
        return nonFictieRepository.findAllNonFictie();
    }

    public NonFictie findNonFictieByTitel(String titel)
    {
        return nonFictieRepository.findByName(titel);
    }

    public NonFictie findNonFictieById(int id)
    {
        return nonFictieRepository.findById(id);
    }

    public void insert(NonFictie fictie)
    {
        nonFictieRepository.insert(fictie);
    }

}
