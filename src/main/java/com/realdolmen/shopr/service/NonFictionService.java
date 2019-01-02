package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.repository.NonFictionRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class NonFictionService {
    @Inject
    private NonFictionRepository nonFictionRepository;

    public NonFiction findNonFictionById(int id) {
        return nonFictionRepository.findById(id);
    }

    public List<NonFiction> findAllNonFiction() {
        return nonFictionRepository.findAll();
    }

    public void insert(NonFiction nonFiction) {
        nonFictionRepository.insert(nonFiction);
    }
}
