package com.realdolmen.shopr.service;

import com.realdolmen.shopr.controller.RatingController;
import com.realdolmen.shopr.domain.Beoordeling;
import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.LpRepository;
import com.realdolmen.shopr.repository.OverviewRepository;
import com.realdolmen.shopr.repository.RatingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

import static org.omnifaces.util.Messages.isEmpty;

@Stateless
public class LpService
{
    @Inject
    private LpRepository lpRepository;
    @Inject
    private RatingRepository ratingRepository;
    @Inject
    private OverviewRepository overviewRepository;

    private List<Beoordeling> beoordelingListLp = new ArrayList<>();

    public List<Beoordeling> getBeoordelingListLp()
    {
        return beoordelingListLp;
    }

    public void setBeoordelingListLp(List<Beoordeling> beoordelingListLp)
    {
        this.beoordelingListLp = beoordelingListLp;
    }

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

    public void ratingsOpHalenLp(int id)
    {
        this.beoordelingListLp = ratingRepository.findBeoordelingenBepaaldArtikel(overviewRepository.findById(id).getId());
    }

    public void deleteBeoordelingenVanLp()
    {
        for (Beoordeling b : beoordelingListLp)
        {
            ratingRepository.delete(b);
        }
    }

    public void delete(int id)
    {
        ratingsOpHalenLp(id);
        if (beoordelingListLp.size() >= 1)
        {
            deleteBeoordelingenVanLp();
        }
        lpRepository.delete(id);
    }

}
