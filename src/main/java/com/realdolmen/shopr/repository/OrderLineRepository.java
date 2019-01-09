package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderLineRepository {

    @PersistenceContext(name="shoprPU")
    EntityManager entityManager;

    public OrderLine findById(int id) {
        return entityManager.find(OrderLine.class, id);
    }

    public void insertOrderLine(OrderLine orderLine) {
        entityManager.persist(orderLine);
    }

    //TODO must be deleted in shoppingbag

}
