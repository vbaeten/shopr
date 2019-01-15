package com.realdolmen.shopr.service;

import com.realdolmen.shopr.controller.UserController;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;

@Stateless
public class OrderService implements Serializable {


    @Inject
    private OrderRepository orderRepository;

    public void submitOrder(Order order) {

        this.orderRepository.submitOrder(order);

    }

    public Order findById(int id) {
        return orderRepository.findById(id);
    }
}
