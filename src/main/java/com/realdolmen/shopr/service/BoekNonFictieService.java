package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BoekNonFiction;
import com.realdolmen.shopr.repository.BoekNonFictieRepository;

import javax.inject.Inject;
import java.util.List;

public class BoekNonFictieService {
    @Inject
    private BoekNonFictieRepository boeknonfictionRepository;

    public BoekNonFiction findUserById(int id) {
        return boeknonfictionRepository.findById(id);
    }

    public List<BoekNonFiction> findAllNonBoekFictions() {
        return boeknonfictionRepository.findAll();
    }

    public BoekNonFiction findBoekNonfictionByTitel(String name) {
        return boeknonfictionRepository.findByTitel(name);
    }

}
