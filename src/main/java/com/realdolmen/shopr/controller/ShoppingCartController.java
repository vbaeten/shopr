package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.ShoppingCartService;
import com.realdolmen.shopr.service.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.NoSuchEntityException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class ShoppingCartController implements Serializable {

    private int userId;
    private int id;
    private ShoppingCart newShoppingCart;
    private ShoppingCart shoppingCart;
    private List<OrderLine> orderLines;

    @Inject
    private ShoppingCartService shoppingCartService;
    @Inject
    private OrderLineService orderLineService;
    @Inject
    private UserService userService;

    //TODO Shoppingcartcontroller must load with site. Works like loggedUser
//
//    @PostConstruct
//    public void init() {
//        shoppingCartService.findShoppingCartByUserId(id);
//    }


    public void loadShoppingCart(int userId) {
        try {
            shoppingCart = shoppingCartService.findShoppingCartByUserId(userId);
        } catch (NoResultException nre) {
            createShoppingCart(userId);
        }
    }

    public void addToCart(int articleId, int quantity, int userId) {
        loadShoppingCart(userId);
    }


    public ShoppingCart loadShoppingCartCheck(int userId) {
        return shoppingCartService.findShoppingCartByUserId(userId);
    }

    public void createShoppingCart(int userId) {
        shoppingCart = new ShoppingCart();
        shoppingCart.setUser(userService.findUserById(userId));
        shoppingCart.setId(userId);
        shoppingCartService.insert(shoppingCart);
    }


    public ShoppingCart getShoppingCart() {
        return newShoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.newShoppingCart = shoppingCart;
    }

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = id;
    }


    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

}
