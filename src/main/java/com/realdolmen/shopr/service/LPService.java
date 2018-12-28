package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.LP;
import com.realdolmen.shopr.repository.LPRepository;

import javax.inject.Inject;
import java.util.List;

public class LPService {
    @Inject
    private LPRepository lPRepository;

    public LP findLPById(Long id) {
        return lPRepository.findById(id);
    }

    public List<LP> findAllLPS() {
        return lPRepository.findAll();
    }

    public LP findByTitle(String title) {
        return lPRepository.findByTitle(title);
    }

    public void updateTitle(Long id, String newTitle) {
        LP lP = lPRepository.findById(id);
        lP.setTitle(newTitle);
    }

    public void removeLP(Long id){
        LP lP = lPRepository.findById(id);
        lPRepository.removeLP(lP);
    }

    public void insert(LP lp){
        lPRepository.insert(lp);
    }
}
