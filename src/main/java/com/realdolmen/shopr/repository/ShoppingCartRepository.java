package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.ShoppingCart;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class ShoppingCartRepository {

    @PersistenceContext(unitName = "shoprPU")
    public EntityManager entityManager;

    public ShoppingCart findById(int id) {
        return entityManager.find(ShoppingCart.class, id);
    }

    public void createShoppingCart(ShoppingCart shoppingCart) {
        entityManager.persist(shoppingCart);
    }
}
