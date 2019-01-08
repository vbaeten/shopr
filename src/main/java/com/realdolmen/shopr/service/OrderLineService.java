package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class OrderLineService {

    @Inject
    private OrderLineRepository orderLineRepository;


    public OrderLine findById(int id){
        return this.orderLineRepository.findById(id);
    }

    public void submit(OrderLine orderLine) {
        this.orderLineRepository.submit(orderLine);
    }
}
