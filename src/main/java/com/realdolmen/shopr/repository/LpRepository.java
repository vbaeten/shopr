package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Lp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LpRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public void insert(Lp lp) {
        entityManager.persist(lp);
    }

    public Lp findById(Long id) {
        return entityManager.find(Lp.class, id);
    }

    public List<Lp> findAll() {
        return entityManager.createNamedQuery(Lp.FIND_ALL, Lp.class).getResultList();
    }

    public void update(Lp lp) {
        entityManager.merge(lp);
    }

    public void delete(Lp lp) {
        entityManager.remove(lp);
    }
}