package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.repository.ArtikelRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ArtikelService {

    @Inject
    private ArtikelRepository artikelRepository;

    public Artikel findArtikelById(int id) {
        return artikelRepository.findById(id);
    }

    public List<Artikel> findAllArtikels() {
        return artikelRepository.findAll();
    }

    public Artikel findArtikelByTitle(String title) {
        return artikelRepository.findByTitle(title);
    }

    public void updateTitle(int id, String newTitle) {
        Artikel artikel = artikelRepository.findById(id);
        artikel.setTitel(newTitle);
    }

    public void insert(Artikel artikel) {
        artikelRepository.insert(artikel);
    }


    public void removeArtikelById(int id){
        artikelRepository.remove(id);
    }

}
