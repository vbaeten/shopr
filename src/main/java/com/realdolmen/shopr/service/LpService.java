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

    public void insert(Lp lp) {
        lpRepository.insert(lp);
    }

    public Lp findLpById(Long id) {
        return lpRepository.findById(id);
    }

    public List<Lp> findAllLps() {
        return lpRepository.findAll();
    }

    public void update(Lp lp) {
        lpRepository.update(lp);
    }

    public void delete(Long id) {
        Lp lp = lpRepository.findById(id);
        lpRepository.delete(lp);
    }
}
