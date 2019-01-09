package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by TLMBM39 on 27/12/2018.
 */
public class ArtikelRepository {
    @PersistenceContext
    private EntityManager em;

    public Artikel findById(int id) {
        return em.find(Artikel.class, id);
    }
    public List<Artikel> findAll() {
        return em.createNamedQuery(Artikel.FIND_ALL, Artikel.class).getResultList();
    }

}
