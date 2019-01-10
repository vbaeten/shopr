package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderLineRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public OrderLine findById(Long id) {
        return entityManager.find(OrderLine.class, id);
    }

    public List<OrderLine> findAll() {
        return entityManager.createQuery("select f from OrderLine f ", OrderLine.class).getResultList();
    }

    public void insert(OrderLine orderLine) {entityManager.persist(orderLine);
    }

    public void remove(OrderLine orderLine) {
        entityManager.remove(orderLine);}
}
