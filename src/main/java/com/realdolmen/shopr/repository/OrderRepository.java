package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public void insert(Order order) {
        entityManager.persist(order);
    }

    public void update(Order order) {
        entityManager.merge(order);
    }
}
