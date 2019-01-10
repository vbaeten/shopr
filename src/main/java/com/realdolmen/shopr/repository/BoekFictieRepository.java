package com.realdolmen.shopr.repository;

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
        return em.createNamedQuery(BoekFiction.FIND_ALL, BoekFiction.class).getResultList();
    }


    public BoekFiction findByTitel(String name) {
        return em.createNamedQuery(BoekFiction.FIND_BY_TITEL, BoekFiction.class).setParameter("BoekFiction", name).getSingleResult();
    }

    public void insert(BoekFiction boekfiction) {
        em.persist(boekfiction);
    }
}
