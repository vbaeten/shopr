package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Artikel;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OverviewRepository
{

    @PersistenceContext
    private EntityManager entityManager;

    public List<Artikel> findAllArtikels()
    {
    return entityManager.createNamedQuery(Artikel.FIND_ALL_ARTIKELS, Artikel.class).getResultList();
    }

    public Artikel findById(int id) {
        return entityManager.find(Artikel.class, id);
    }

}
