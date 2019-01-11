package com.realdolmen.shopr.service;

import com.realdolmen.shopr.controller.RatingController;
import com.realdolmen.shopr.domain.Beoordeling;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.LpRepository;
import com.realdolmen.shopr.repository.OverviewRepository;
import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class LpService
{
@Inject
    private LpRepository lpRepository;
@Inject
private RatingRepository ratingRepository;
@Inject
private OverviewRepository overviewRepository;

    public List<Lp> findAllLps()
    {
        return lpRepository.findAllLps();
    }

    public Lp findLpByTitel(String titel)
    {
        return lpRepository.findByName(titel);
    }

    public Lp findLpById(int id)
    {
        return lpRepository.findById(id);
    }

    public void insert(Lp lp)
    {
        lpRepository.insert(lp);
    }

    public void editLpinDb(Lp lp)
    {
        Lp oldLp = findLpById(lp.getId());
        oldLp.setTitel(lp.getTitel());
        oldLp.setLeverancier(lp.getLeverancier());
        oldLp.setUitvoerder(lp.getUitvoerder());
        oldLp.setEnumMuziekGenre(lp.getEnumMuziekGenre());
        oldLp.setPrijs(lp.getPrijs());


    }
    public void update(Lp lp)
    {
        lpRepository.update(lp);
    }

    public void delete(int id)
    {

        for (Beoordeling b : ratingRepository.findBeoordelingenBepaaldArtikel(overviewRepository.findById(id).getId()))
        {
            ratingRepository.delete(b);
        }
        Lp lp = lpRepository.findById(id);
        lpRepository.delete(lp);
    }

}
