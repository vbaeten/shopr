package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderRepository extends CrudRepository<Order, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }

}
