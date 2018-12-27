package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.repository.NonFictionRepository;

import javax.inject.Inject;

public class NonFictionService {


    @Inject
    private NonFictionRepository nonFictionRepository = new NonFictionRepository();


    public void insert(NonFiction newNonFiction) {
        nonFictionRepository.insert(newNonFiction);
    }
}
