package com.realdolmen.shopr.repository;


import com.realdolmen.shopr.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class OrderRepository {


    @PersistenceContext
    private EntityManager entityManager;



    public void submitOrder(Order order) {

        this.entityManager.persist(order);
    }
}
