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

    public Fiction findById(Long id) { return fictionRepository.findById(id); }

    public List<Fiction> findAll() { return fictionRepository.findAll(); }

    public Fiction findByTitle(String title) { return fictionRepository.findByTitle(title); }

    public void save(Fiction fiction) { fictionRepository.save(fiction);}
}
