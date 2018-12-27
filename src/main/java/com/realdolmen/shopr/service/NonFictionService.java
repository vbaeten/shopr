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

    public NonFiction findById(Long id) { return nonFictionRepository.findById(id); }

    public List<NonFiction> findAll() { return nonFictionRepository.findAll(); }

    public NonFiction findByTitle(String title) { return nonFictionRepository.findByTitle(title); }

    public void save(NonFiction nonFiction) { nonFictionRepository.save(nonFiction);}
}
