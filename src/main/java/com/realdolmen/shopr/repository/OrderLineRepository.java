package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderLineRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public void insert(OrderLine orderLine) {
        entityManager.persist(orderLine);
    }

    public OrderLine findById(Long id) {
        return entityManager.find(OrderLine.class, id);
    }

    public void delete(OrderLine orderLine) {
        entityManager.remove(orderLine);
    }
}
