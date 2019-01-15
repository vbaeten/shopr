package com.realdolmen.shopr.repository;


import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderRepository {


    @PersistenceContext
    private EntityManager entityManager;



    public Order submitOrder(Order order) {
        return this.entityManager.merge(order);
    }

    public Order findById(int id) {
       return entityManager.find(Order.class,id);
    }
}
