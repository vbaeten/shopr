package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Lp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LpRepository {
    @PersistenceContext
    private EntityManager em;

    public Lp findById(int id) {
        return em.find(Lp.class, id);
    }

    public List<Lp> findAll() {
        return em.createNamedQuery(Lp.FIND_ALL, Lp.class).getResultList();
    }


    public Lp findByTitel(String name) {
        return em.createNamedQuery(Lp.FIND_BY_TITEL, Lp.class).setParameter("lp", name).getSingleResult();
    }

    public void insert(Lp lp) {
        em.persist(lp);
    }
}
