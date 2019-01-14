package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.repository.ArtikelRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

/**
 * Created by TLMBM39 on 27/12/2018.
 */
@Stateless
public class ArtikelService  implements Serializable {
    @Inject
    private ArtikelRepository artikelRepository;

    public Artikel findById(int id) {
        return artikelRepository.findById(id);
    }


    public List<Artikel> findArtikelById() {
        return artikelRepository.findAll();
    }


}
