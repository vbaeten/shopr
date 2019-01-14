package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.service.ArticleService;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.ShoppingCartService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class ShoppingCartController implements Serializable {

    private int userId;
    private ShoppingCart newShoppingCart;
    private ShoppingCart shoppingCart;
    private List<OrderLine> orderLines = new ArrayList<>();
    private OrderLine orderLine;

    @Inject
    private ShoppingCartService shoppingCartService;
    @Inject
    private OrderLineService orderLineService;
    @Inject
    private UserService userService;
    @Inject
    private ArticleService articleService;

    public ShoppingCart loadShoppingCart(int userId) {
        try {
            return shoppingCart = shoppingCartService.findShoppingCartByUserId(userId);
        } catch (NoResultException nre) {
            return shoppingCart = null;
        }
    }

    public void createOrderLine(int articleId, int quantity, int userId) {
        orderLine = new OrderLine();
        this.orderLine.setArticle(articleService.findArticleById(articleId));
        this.orderLine.setUser(userService.findUserById(userId));
        this.orderLine.setQuantity(quantity);
        this.orderLine.setShoppingCart(shoppingCartService.findShoppingCartByUserId(userId));
        orderLineService.insertOrderLine(orderLine);
    }

    public void addToCart(int articleId, int quantity, int userId) {
        createOrderLine(articleId, quantity, userId);
        shoppingCart = loadShoppingCart(userId);
        orderLines = shoppingCart.getOrderLines();
        shoppingCart.addOrderLine(orderLine);
    }

    public void removeFromCart (int id) {
        orderLineService.removeOrderLine(orderLine);
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
