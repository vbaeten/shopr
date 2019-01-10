package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDate;

public class OrderRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Order findOrderById(Long id) {
        return entityManager.find(Order.class, id);
    }

    public Order findOrderByDate(LocalDate date) {
        return entityManager.createQuery("select o from Order o where o.orderDate = :date", Order.class).getSingleResult();
    }

    public Order findOrderByUsername(String username) {
        return entityManager.createQuery("select o from Order o where o.user.firstName = :username", Order.class).getSingleResult();
    }

    public void save(Order order) {
        entityManager.persist(order);
    }

    public void insert(OrderLine orderLine) {
        entityManager.persist(orderLine);
    }

}
