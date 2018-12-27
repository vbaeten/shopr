package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Lp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LpRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public List<Lp> findAll() {
        return entityManager.createNamedQuery(Lp.FIND_ALL, Lp.class).getResultList();
    }
}
