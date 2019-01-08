package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class OrderService {
    @Inject
    private OrderRepository orderRepository;

    public void insert(Order order) {
        orderRepository.insert(order);
    }

    public void update(Order order) {
        orderRepository.update(order);
    }
}
