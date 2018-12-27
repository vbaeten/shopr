package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.repository.OrderRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.time.LocalDate;

@Stateless
public class OrderService {

    @Inject
    private OrderRepository orderRepository;

    public Order findById(Long id) { return orderRepository.findOrderById(id); }

    public Order findByUsername(String username) { return orderRepository.findOrderByUsername(username); }

    public Order findByDate(LocalDate date) { return orderRepository.findOrderByDate(date); }
}
