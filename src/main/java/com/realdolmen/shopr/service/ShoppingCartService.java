package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
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

    public ShoppingCart findShoppingCartByUser(User user) {
        return shoppingCartRepository.findShoppingCartByUser(user);
    }

    public ShoppingCart findShoppingCartByUserId(int id) {
        return shoppingCartRepository.findShoppingCartByUserId(id);
    }

    public void createShoppingCart(ShoppingCart shoppingCart) {
        shoppingCartRepository.createShoppingCart(shoppingCart);
    }

    public void addOrderLine(int id, OrderLine orderLine) {
        ShoppingCart shoppingCart = shoppingCartRepository.findShoppingCartByUserId(id);
    }
}
