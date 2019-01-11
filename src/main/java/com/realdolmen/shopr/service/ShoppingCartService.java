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
        return shoppingCartRepository.findByUser(user);
    }

    public ShoppingCart findShoppingCartByUserId(int id) {
        return shoppingCartRepository.findByUserId(id);
    }

    public void insert(ShoppingCart shoppingCart) {
        shoppingCartRepository.insert(shoppingCart);
    }

    public void deleteCart(int id) { shoppingCartRepository.delete(id);}

}
