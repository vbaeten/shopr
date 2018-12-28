package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Fictie;
import com.realdolmen.shopr.repository.FictieRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class FictieService {

    @Inject
    private FictieRepository fictieRepository;

    public Fictie findById(int id) {
        return fictieRepository.findById(id);
    }

    public List<Fictie> findAll() {
        return fictieRepository.findAll();
    }

    public Fictie findByTitle(String title) {
        return fictieRepository.findByTitle(title);
    }

    public void updateTitle(int id, String newTitel) {
        Fictie fictie = fictieRepository.findById(id);
        fictie.setTitel(newTitel);
    }

    public void insert(Fictie fictie) {
        fictieRepository.insert(fictie);
    }

    public void removeById(int id){
        fictieRepository.remove(id);
    }

}
