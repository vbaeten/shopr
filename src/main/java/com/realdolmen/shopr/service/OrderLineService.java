package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.List;

@Stateless
public class OrderLineService {
    @Inject
    private OrderLineRepository orderLineRepository;

    public OrderLine findOrderLineById(Long orderlineId) {
        return orderLineRepository.findByOrderLineId(orderlineId);
    }

    public List<OrderLine> findAllOrderLines() {
        return orderLineRepository.findAll();
    }

    public void insert(OrderLine orderLine) {
        orderLineRepository.insert(orderLine);
    }

    public void removeByOrderlineId(Long orderlineId) {
        OrderLine orderLine = orderLineRepository.findByOrderLineId(orderlineId);
        orderLineRepository.remove(orderLine);
    }

    public BigDecimal calculateSubtotal(BigDecimal quantity, BigDecimal price){
        return  quantity.multiply(price);
    }
}
