package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.LpRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class LpService
{
@Inject
    private LpRepository lpRepository;

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

}
