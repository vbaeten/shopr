package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderLineRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void submit(OrderLine orderLine) {
        this.entityManager.persist(orderLine);
    }

    public OrderLine findById(int id){
        return entityManager.find(OrderLine.class,id);
    }

}
