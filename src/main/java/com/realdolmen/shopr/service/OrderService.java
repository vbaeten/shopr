package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class OrderService {

    @Inject
    private OrderRepository orderRepository;


    public Order findById(int id) {
        return orderRepository.findById(id);
    }

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public List<Order> findOrdersByUserId(int id) {
        return orderRepository.findByUserId(id);
    }

    public void insert(Order order) {
        orderRepository.insert(order);
    }

    public void removeById(int id) {
        orderRepository.remove(id);
    }

    public void update(Order order) {
        orderRepository.update(order);
    }
}
