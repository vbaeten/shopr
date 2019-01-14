package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
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

    private Order newOrder = new Order();
    private List<OrderLine> orderLines = new ArrayList<OrderLine>();

    @Inject
    private OrderService orderService;
    @Inject
    private OrderLineService orderLineService;
    @Inject
    private UserService userService;
    @Inject
    private ShoppingCartService shoppingCartService;

    public void submitOrder(int userId, List<OrderLine> orderLines) {
        newOrder = new Order();
        newOrder.setUser(userService.findUserById(userId));
        newOrder.setOrderDate(new Timestamp(System.currentTimeMillis()));
        newOrder.setOrderLines(orderLines);
        orderService.createOrder(newOrder);
    }

    public void orderCart(int cartId) {

    }
}
