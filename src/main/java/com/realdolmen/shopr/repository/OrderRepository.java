package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderRepository {
    @PersistenceContext (unitName = "shoprPU")
    public EntityManager entityManager;

    public Order findById(int id) {
        return entityManager.find(Order.class, id);
    }

    public List<Order> findAll() {
        return entityManager.createNamedQuery(Order.FIND_ALL, Order.class).getResultList();
    }

    public void createOrder(Order order) {
        entityManager.persist(order);
    }

    public void delete(int id) {
        entityManager.remove(entityManager.getReference(Order.class, id));
    }
}
