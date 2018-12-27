package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.repository.LPRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class LPService {

    @Inject
    private LPRepository lpRepository;

    public LP findById(Long id) { return lpRepository.findById(id); }

    public List<LP> findAll() { return lpRepository.findAll(); }

    public LP findByTitle(String title) { return lpRepository.findByTitle(title); }

    public void save(LP lp) { lpRepository.save(lp);}
}
