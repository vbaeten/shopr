package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BoekFiction;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.BoekFictieRepository;

import javax.inject.Inject;
import java.util.List;

public class BoekFictieService {
    @Inject
    private BoekFictieRepository boekfictieRepository;

    public BoekFiction findById(int id) {
        return boekfictieRepository.findById(id);
    }

    public List<BoekFiction> findAllBoekFictions() {
        return boekfictieRepository.findAll();
    }

    public BoekFiction findBoekByTitel(String name) {
        return boekfictieRepository.findByTitel(name);
    }

}
