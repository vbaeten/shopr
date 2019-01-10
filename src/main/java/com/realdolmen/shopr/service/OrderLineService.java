package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class OrderLineService {
    @Inject
    private OrderLineRepository orderLineRepository;

    public OrderLine findOrderLineById(Long id) {
        return orderLineRepository.findById(id);
    }

    public List<OrderLine> findAllOrderLines() {
        return orderLineRepository.findAll();
    }

    public void insert(OrderLine orderLine) {
        orderLineRepository.insert(orderLine);
    }

    public void removeById(Long id) {
        OrderLine orderLine = orderLineRepository.findById(id);
        orderLineRepository.remove(orderLine);
    }
}
