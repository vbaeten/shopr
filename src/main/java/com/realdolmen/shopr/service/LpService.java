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

    public List<Lp> findAllLps() {
        return lpRepository.findAll();
    }
}
