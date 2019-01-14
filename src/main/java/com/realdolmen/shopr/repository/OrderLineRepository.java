package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class OrderLineRepository {

    @PersistenceContext(name="shoprPU")
    public EntityManager entityManager;

    public OrderLine findById(int id) {
        return entityManager.find(OrderLine.class, id);
    }

    public List<OrderLine> findAll() {
        return entityManager.createNamedQuery(OrderLine.FIND_ALL, OrderLine.class).getResultList();
    }

    public List<OrderLine> findByUser(User user) {
        return entityManager.createNamedQuery(OrderLine.FIND_BY_USER, OrderLine.class)
                .setParameter("user", user).getResultList();
    }

    public List<OrderLine> findByUserId(int id) {
        return entityManager.createNamedQuery(OrderLine.FIND_BY_USER_ID, OrderLine.class)
                .setParameter("id", id).getResultList();
    }

    public List<OrderLine> findByShoppingCart(ShoppingCart shoppingCart) {
        return entityManager.createNamedQuery(OrderLine.FIND_BY_USER, OrderLine.class)
                .setParameter("shoppingCart", shoppingCart).getResultList();
    }

    public void insertOrderLine(OrderLine orderLine) {
        entityManager.persist(orderLine);
    }

    public void deleteOrderLine(int id) {
        entityManager.remove(entityManager.getReference(OrderLine.class, id));
    }

    public void removeOrderLine(OrderLine orderLine) {
        entityManager.remove(orderLine);
    }

}
