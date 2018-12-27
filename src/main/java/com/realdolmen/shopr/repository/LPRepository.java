package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.LP;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LPRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<LP> findAllLps() {
        return entityManager.createNamedQuery(LP.FIND_ALL, LP.class).getResultList();

    }

    public void insert(LP lp) {

        entityManager.persist(lp);

    }
}
