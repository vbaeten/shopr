package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.OrderService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class OrderController {

    private Order newOrder = new Order();
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();

    @Inject
    private OrderService orderService;
    @Inject
    private OrderLineService orderLineService;
    @Inject
    private UserService userService;

    //TODO order is created with orderlines in shoppingbag logged user
    public void submitOrder(int userId) {
        orderLines = orderLineService.findOrderLinesByUser(userService.findUserById(userId));
        newOrder.setOrderLines(orderLines);
        newOrder.setUser(userService.findUserById(userId));
        this.orderService.createOrder(newOrder);
        newOrder = new Order();
    }

    public void orderCart(int cartId) {

    }
}
