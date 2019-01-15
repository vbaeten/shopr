package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.LP;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class LPRepository extends CrudRepository<LP, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
}
