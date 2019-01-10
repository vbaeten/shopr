package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@Stateless
public class OrderLineService implements Serializable {
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

    public void delete(Long id) {
        OrderLine orderLine = orderLineRepository.findById(id);
        orderLineRepository.delete(orderLine);
    }

    public List<OrderLine> findAllOrderLinesByOrderId(Long id) {
        return orderLineRepository.findAllByOrderId(id);
    }


}