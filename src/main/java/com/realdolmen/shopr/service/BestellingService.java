package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Bestelling;
import com.realdolmen.shopr.repository.BestellingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class BestellingService {

    @Inject
    private BestellingRepository bestellingRepository;

    public Bestelling findBestellingById(int id) {
        return bestellingRepository.findById(id);
    }

    public List<Bestelling> findAllBestellingen() {
        return bestellingRepository.findAll();
    }

    public List <Bestelling> findBestellingenByUserId(int id) {
        return bestellingRepository.findByUserId(id);
    }

    public void insert(Bestelling bestelling) {
        bestellingRepository.insert(bestelling);
    }


    public void removeBestellingById(int id) {
        bestellingRepository.remove(id);
    }

}
