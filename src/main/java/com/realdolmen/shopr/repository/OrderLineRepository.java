package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderLineRepository {

    @PersistenceContext(name="shoprPU")
    public EntityManager entityManager;

    public OrderLine findById(int id) {
        return entityManager.find(OrderLine.class, id);
    }

    public List<OrderLine> findAll() {
        return entityManager.createNamedQuery(OrderLine.FIND_ALL, OrderLine.class).getResultList();
    }

    public void insertOrderLine(OrderLine orderLine) {
        entityManager.persist(orderLine);
    }

    //TODO must be deleted in shoppingbag

}
