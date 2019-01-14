package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BoekFiction;
import com.realdolmen.shopr.domain.Game;
import com.realdolmen.shopr.repository.BoekFictieRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
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
    @Transactional
    public void removeById(int id) {
        boekfictieRepository.remove(id);
    }
    @Transactional
    public void insert(BoekFiction boekfiction) {
        boekfictieRepository.insert(boekfiction);
    }


}
