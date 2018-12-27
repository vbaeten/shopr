package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.repository.ArtikelRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by TLMBM39 on 27/12/2018.
 */
@Stateless
public class ArtikelService {
    @Inject
    private ArtikelRepository artikelRepository;

    public Artikel findArtikelById(int id) {
        return artikelRepository.findById(id);
    }
}
