package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.BoekNonFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BoekNonFictieRepository {
    @PersistenceContext
    private EntityManager em;

    public BoekNonFiction findById(int id) {
        return em.find(BoekNonFiction.class, id);
    }

    public List<BoekNonFiction> findAll() {
        return em.createNamedQuery(BoekNonFiction.FIND_ALL, BoekNonFiction.class).getResultList();
    }


    public BoekNonFiction findByTitel(String name) {
        return em.createNamedQuery(BoekNonFiction.FIND_BY_TITEL, BoekNonFiction.class).setParameter("BoekNonFiction", name).getSingleResult();
    }

    public void insert(BoekNonFiction boeknonfiction) {
        em.persist(boeknonfiction);
    }
}
