package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.repository.ShoppingCartRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ShoppingCartService {

    @Inject
    private ShoppingCartRepository shoppingCartRepository;

    public ShoppingCart findShoppingCartById(int id) {
        return shoppingCartRepository.findById(id);
    }

    public void insert(ShoppingCart shoppingCart) {
        shoppingCartRepository.createShoppingCart(shoppingCart);
    }

}
