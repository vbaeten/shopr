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

    public List<Order> findOrdersByUserId(Long id) {
        return entityManager.createNamedQuery(Order.FIND_ALL_BY_USER_ID, Order.class).setParameter("id", id).getResultList();
    }

    public void insert(Order order) {
        entityManager.persist(order);
    }

    public void update(Order order) {
        entityManager.merge(order);
    }

    public void delete(Order order) {
        entityManager.remove(order);
    }
}
