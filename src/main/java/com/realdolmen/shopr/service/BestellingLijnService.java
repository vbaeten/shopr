package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.BestellingLijn;
import com.realdolmen.shopr.repository.BestellingLijnRepository;
import com.realdolmen.shopr.repository.BestellingRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class BestellingLijnService {

    @Inject
    BestellingLijnRepository bestellingLijnRepository;

    public BestellingLijn findBestellingLijnById(int id) {
        return bestellingLijnRepository.findById(id);
    }

    public List<BestellingLijn> findAllBestellingLijnen() {
        return bestellingLijnRepository.findAll();
    }

    public List <BestellingLijn> findBestellingLijnenByBestellingId(int id) {
        return bestellingLijnRepository.findByBestellingId(id);
    }

    public void insert(BestellingLijn bestellingLijn) {
        bestellingLijnRepository.insert(bestellingLijn);
    }


    public void removeBestellingLijnById(int id) {
        bestellingLijnRepository.removeById(id);
    }


}
