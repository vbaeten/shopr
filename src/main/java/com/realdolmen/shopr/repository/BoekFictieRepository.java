package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Boek;
import com.realdolmen.shopr.domain.BoekFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BoekFictieRepository {
    @PersistenceContext
    private EntityManager em;

    public BoekFiction findById(int id) {
        return em.find(BoekFiction.class, id);
    }

    public List<BoekFiction> findAll() {
        List<BoekFiction> results =  em.createNamedQuery(BoekFiction.FIND_ALL, BoekFiction.class).getResultList();
        return results;
    }


    public BoekFiction findByTitel(String name) {
        return em.createNamedQuery(BoekFiction.FIND_BY_TITEL, BoekFiction.class).setParameter("BoekFiction", name).getSingleResult();
    }

    public void insert(BoekFiction boekfiction) {
        em.persist(boekfiction);
    }
    public void remove(int id) {
        BoekFiction BoekfictionById = findById(id);
        em.remove(BoekfictionById);
    }
}
