package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class OrderLineService {
    @Inject
    private OrderLineRepository orderLineRepository;

    public void insert(OrderLine orderLine) {
        orderLineRepository.insert(orderLine);
    }

    public OrderLine findOrderLineById(Long id) {
        return orderLineRepository.findById(id);
    }

    public void delete(Long id) {
        OrderLine orderLine = orderLineRepository.findById(id);
        orderLineRepository.delete(orderLine);
    }
}