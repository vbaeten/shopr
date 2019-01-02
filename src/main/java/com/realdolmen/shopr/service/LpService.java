package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.LpRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class LpService {
    @Inject
    private LpRepository lpRepository;

    public Lp findLpById(int id) {
        return lpRepository.findById(id);
    }

    public List<Lp> findAllLps() {
        return lpRepository.findAll();
    }

    public void insertLp(Lp lp) {
        lpRepository.insertLp(lp);
    }
}
