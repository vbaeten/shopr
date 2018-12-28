package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.NonFictie;
import com.realdolmen.shopr.repository.NonFictieRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class NonFictieService {

    @Inject
    private NonFictieRepository nonFictieRepository;

    public NonFictie findById(int id) {
        return nonFictieRepository.findById(id);
    }

    public List<NonFictie> findAll() {
        return nonFictieRepository.findAll();
    }

    public NonFictie findByTitle(String title) {
        return nonFictieRepository.findByTitle(title);
    }

    public void updateTitle(int id, String newTitel) {
        NonFictie nonFictie = nonFictieRepository.findById(id);
        nonFictie.setTitel(newTitel);
    }

    public void insert(NonFictie nonFictie) {
        nonFictieRepository.insert(nonFictie);
    }

    public void removeById(int id){
        nonFictieRepository.remove(id);
    }
}
