package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.repository.NonFictionRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class NonFictionService {
    @Inject
    private NonFictionRepository nonFictionRepository;

    public void insert(NonFiction nonFiction) {
        nonFictionRepository.insert(nonFiction);
    }

    public NonFiction findNonFictionById(Long id) {
        return nonFictionRepository.findById(id);
    }

    public void update(NonFiction nonFiction) {
        nonFictionRepository.update(nonFiction);
    }

    public void delete(Long id) {
        NonFiction nonFiction = nonFictionRepository.findById(id);
        nonFictionRepository.delete(nonFiction);
    }
}
