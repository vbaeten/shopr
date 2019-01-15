package com.realdolmen.shopr.repository;


import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderRepository {


    @PersistenceContext
    private EntityManager entityManager;



    public void submitOrder(Order order) {
        this.entityManager.merge(order);
    }

    public Order findById(int id) {
       return entityManager.find(Order.class,id);
    }
}
