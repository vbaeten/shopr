package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class OrderService {




    @Inject
    private OrderRepository orderRepository;

    public void submitOrder(Order order) {

        this.orderRepository.submitOrder(order);

    }
}
