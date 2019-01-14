package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class OrderService {

    @Inject
    private OrderRepository orderRepository;

    public Order findOrderById(int id) {
        return orderRepository.findById(id);
    }

    public List<Order> findOrdersByUser(User user) {
        return orderRepository.findByUser(user);
    }

    public void createOrder(Order order) {
        orderRepository.createOrder(order);
    }


}
