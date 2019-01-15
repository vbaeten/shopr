package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@Stateless
public class OrderLineService implements Serializable {

    @Inject
    private OrderLineRepository orderLineRepository;


    public OrderLine findById(int id){
        return this.orderLineRepository.findById(id);
    }

    public void submit(OrderLine orderLine) {
        this.orderLineRepository.submit(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return this.orderLineRepository.findAllOrderLines();
    }

}
