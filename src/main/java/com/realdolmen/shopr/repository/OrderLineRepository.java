package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderLineRepository extends CrudRepository<OrderLine, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
}
