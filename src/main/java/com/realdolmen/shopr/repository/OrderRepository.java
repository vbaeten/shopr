package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Order findById(Long id) {
        return entityManager.find(Order.class, id);
    }

    public List<Order> findAll() {
        return entityManager.createQuery("select f from Order f ", Order.class).getResultList();
    }

    public void insert(Order order) {entityManager.persist(order);
    }
}
