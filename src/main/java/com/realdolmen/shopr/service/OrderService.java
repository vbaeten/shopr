package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.repository.CrudRepository;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.inject.Inject;

public class OrderService extends CrudService<Order, Long> {
    @Inject
    private OrderRepository orderRepository;

    @Override
    CrudRepository<Order, Long> getRepository() {
        return orderRepository;
    }
}
