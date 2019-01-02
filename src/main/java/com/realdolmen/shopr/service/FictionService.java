package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.repository.FictionRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FictionService {
    @Inject
    private FictionRepository fictionRepository;

    public Fiction findFictionById(int id) {
        return fictionRepository.findById(id);
    }

    public List<Fiction> findAllFiction() {
        return fictionRepository.findAll();
    }

    public void insert(Fiction fiction) {
        fictionRepository.insert(fiction);
    }
}
