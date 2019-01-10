package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderLineRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;


    public OrderLine findById(int id) {
        return entityManager.createNamedQuery(OrderLine.FIND_BY_ID, OrderLine.class).getSingleResult();
    }

    public List<OrderLine> findAll() {
        return entityManager.createNamedQuery(OrderLine.FIND_ALL, OrderLine.class).getResultList();
    }

    public List<OrderLine> findByOrderId(int id) {
        return entityManager.createNamedQuery(OrderLine.FIND_BY_ORDER_ID, OrderLine.class).setParameter("id", id).getResultList();
    }

    public void insert(OrderLine orderLine) {
        entityManager.persist(orderLine);
    }

    public void removeById(int id) {
        OrderLine orderLineById = findById(id);
        entityManager.remove(orderLineById);
    }

}
