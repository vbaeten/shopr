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
//    private OrderLine orderLine;
//    private double orderLinePrice = orderLine.getItem().getPrice() * orderLine.getQuantity();




    public OrderLine findById(int id){
        return this.orderLineRepository.findById(id);
    }

    public void submit(OrderLine orderLine) {
        this.orderLineRepository.submit(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return this.orderLineRepository.findAllOrderLines();
    }

//    public double getOrderLinePrice() {
//        return orderLinePrice;
//    }
//
//    public void setOrderLinePrice(double orderLinePrice) {
//        this.orderLinePrice = orderLinePrice;
//    }
}
