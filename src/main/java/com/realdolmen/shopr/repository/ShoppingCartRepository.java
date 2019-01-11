package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ShoppingCartRepository {

    @PersistenceContext(unitName = "shoprPU")
    public EntityManager entityManager;

    public ShoppingCart findById(int id) {
        return entityManager.find(ShoppingCart.class, id);
    }

    public ShoppingCart findByUser(User user) {
        return entityManager.createNamedQuery(ShoppingCart.FIND_BY_USER, ShoppingCart.class)
                .setParameter("user", user)
                .getSingleResult();
    }

    public ShoppingCart findByUserId(int id) {
        return entityManager.createNamedQuery(ShoppingCart.FIND_BY_USER_ID, ShoppingCart.class)
                .setParameter("id", id).getSingleResult();
    }

    public void insert(ShoppingCart shoppingCart) {
        entityManager.persist(shoppingCart);
    }

    public void delete(int id) {
        entityManager.remove(entityManager.getReference(ShoppingCart.class, id));
    }
}
