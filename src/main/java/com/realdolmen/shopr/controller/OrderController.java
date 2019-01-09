package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.service.OrderService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class OrderController {

    private Order newOrder = new Order();

    @Inject
    private OrderService orderService;

    public void submitOrder() {
        this.orderService.createOrder(newOrder);
    }
}
