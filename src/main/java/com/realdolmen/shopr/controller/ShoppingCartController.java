package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.ShoppingCartService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@SessionScoped
public class ShoppingCartController {

    @Inject
    private OrderLineController orderLineController;
    @Inject
    private OrderController orderController;
    @Inject
    private ShoppingCartService shoppingCartService;

    private ShoppingCart newShoppingCart;
    private int id;
    private User user;
    private List<OrderLine> orderLines;

    public void loadShoppingCart() {
        this.shoppingCartService.insert(newShoppingCart);
    }

    public ShoppingCart getShoppingCart() {
        return newShoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.newShoppingCart = shoppingCart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
