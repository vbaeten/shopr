package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.repository.FictionRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class FictionService {
    @Inject
    private FictionRepository fictionRepository;

    public void insert(Fiction fiction) {
        fictionRepository.insert(fiction);
    }

    public Fiction findFictionById(Long id) {
        return fictionRepository.findById(id);
    }

    public void update(Fiction fiction) {
        fictionRepository.update(fiction);
    }

    public void delete(Long id) {
        Fiction fiction = fictionRepository.findById(id);
        fictionRepository.delete(fiction);
    }
}
