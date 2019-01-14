package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.OrderService;
import com.realdolmen.shopr.service.ShoppingCartService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class OrderController {

    @Inject
    private OrderService orderService;
    @Inject
    private OrderLineService orderLineService;
    @Inject
    private UserService userService;
    @Inject
    private ShoppingCartService shoppingCartService;

    private Order newOrder = new Order();
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();
    private OrderLine orderLine;

    public void submitOrder(int userId) {
        newOrder = new Order();
        orderLines = orderLineService.findOrderLinesByUser(userService.findUserById(userId));
        newOrder.setUser(userService.findUserById(userId));
        newOrder.setOrderDate(new Timestamp(System.currentTimeMillis()));
        newOrder.setOrderLines(orderLines);
        orderService.createOrder(newOrder);
        for (OrderLine orderLine: orderLines) {
            orderLineService.sendToOrder(orderLine.getId(), newOrder);
        }
    }

    public List<Order> findOrdersByUserId(int id) {
        return orderService.findOrdersByUser(userService.findUserById(id));
    }

    public void orderCart(int cartId) {

    }

    public Order getNewOrder() {
        return newOrder;
    }

    public void setNewOrder(Order newOrder) {
        this.newOrder = newOrder;
    }
}
