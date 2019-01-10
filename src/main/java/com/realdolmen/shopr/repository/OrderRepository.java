package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Order;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;


    public Order findById(int id) {
        return entityManager.createNamedQuery(Order.FIND_BY_ID, Order.class).getSingleResult();
    }

    public List<Order> findAll() {
        return entityManager.createNamedQuery(Order.FIND_ALL, Order.class).getResultList();
    }

    public List<Order> findByUserId(int id) {
        return entityManager.createNamedQuery(Order.FIND_BY_USER_ID, Order.class).setParameter("id", id).getResultList();
    }

    public void insert(Order order) {
        entityManager.persist(order);
    }

    public void remove(int id) {
        Order orderById = findById(id);
        entityManager.remove(orderById);
    }

}
