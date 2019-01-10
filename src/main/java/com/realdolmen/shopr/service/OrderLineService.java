package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class OrderLineService {

    @Inject
    OrderLineRepository orderLineRepository;


    public OrderLine findById(int id) {
        return orderLineRepository.findById(id);
    }

    public List<OrderLine> findAllOrders() {
        return orderLineRepository.findAll();
    }

    public List<OrderLine> findByOrderId(int id) {
        return orderLineRepository.findByOrderId(id);
    }

    public void insert(OrderLine orderLine) {
        orderLineRepository.insert(orderLine);
    }

    public void removeById(int id) {
        orderLineRepository.removeById(id);
    }


}
