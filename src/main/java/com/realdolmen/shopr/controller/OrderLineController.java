package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.beans.LoginBean;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.service.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ViewScoped
@ManagedBean
public class OrderLineController implements Serializable {

    @Inject
    private OrderLineService orderLineService;
    @Inject
    private ArticleService articleService;
    @Inject
    private OrderService orderService;
    @Inject
    private ShoppingCartService shoppingCartService;
    @Inject
    private UserService userService;
    @Inject
    private LoginBean loginBean;

    private ShoppingCart shoppingCart;
    private Order newOrder = new Order();
    private OrderLine orderLine;
    private int quantity = 1;
    private double subtotal;
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void addToCart (int id, int quantity, int userId) {
        orderLine = new OrderLine();
        this.orderLine.setUser(userService.findUserById(userId));
        this.orderLine.setQuantity(quantity);
        this.orderLine.setArticle(articleService.findArticleById(id));
        orderLineService.insertOrderLine(orderLine);
    }

    public void removeFromCart (int id) {
        this.orderLineService.deleteOrderLine(id);
    }

    public void sendToOrder (int id, Order order) {
        this.orderLineService.sendToOrder(id, order);
    }

    public List<OrderLine> getOrderLines() {
        return orderLineService.findAllOrderLines();
    }

    public List<OrderLine> getOrderLinesByUser(int id) {
        return orderLineService.findOrderLinesByUser(userService.findUserById(id));
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }




}
