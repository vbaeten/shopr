package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.repository.FictionRepository;

import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.List;

public class FictionService {


    @Inject
    private FictionRepository fictionRepository = new FictionRepository();

    @Transactional
    public void insert(Fiction newFiction) {
        fictionRepository.insert(newFiction);
    }

    public List<Fiction> findAllFictions() {
        return this.fictionRepository.findAllFictions();
    }
}
