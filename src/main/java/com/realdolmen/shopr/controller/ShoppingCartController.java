package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.ShoppingCartService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class ShoppingCartController implements Serializable {

    private int id = 0;
    private ShoppingCart newShoppingCart;
    private ShoppingCart shoppingCart;
    private User user = null;
    private List<OrderLine> orderLines;

    @Inject
    private ShoppingCartService shoppingCartService;
    @Inject
    private OrderLineService orderLineService;

    //TODO Shoppingcartcontroller must load with site. Works like loggedUser
//
//    @PostConstruct
//    public void init() {
//        shoppingCartService.findShoppingCartByUserId(id);
//    }

    public void addOrderLine(int id, OrderLine orderLine) {
        shoppingCart = shoppingCartService.findShoppingCartByUserId(id);
        orderLines = shoppingCart.getOrderLines();
        orderLines.add(orderLine);
    }

    public void loadShoppingCart() {
        this.shoppingCartService.createShoppingCart(newShoppingCart);
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
