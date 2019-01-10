package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.repository.LpRepository;

import javax.inject.Inject;
import java.util.List;

public class LpService {
    @Inject
    private LpRepository lpRepository;

    public Lp findById(int id) {
        return lpRepository.findById(id);
    }

    public List<Lp> findAll() {
        return lpRepository.findAll();
    }

    public Lp findByTitel(String name) {
        return lpRepository.findByTitel(name);
    }
}
