package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.OrderLine;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderLineRepository extends CrudRepository<OrderLine, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
//
//    public OrderLine findByOrderLineId(Long orderlineId) {
//        return entityManager.find(OrderLine.class, orderlineId);
//    }
//
//    public List<OrderLine> findAll() {
//        return entityManager.createQuery("select f from OrderLine f ", OrderLine.class).getResultList();
//    }
//
//    public void insert(OrderLine orderLine) {entityManager.persist(orderLine);
//    }
//
//    public void remove(OrderLine orderLine) {
//        entityManager.remove(orderLine);}
}
