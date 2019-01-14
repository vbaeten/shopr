package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Article;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.repository.CrudRepository;
import com.realdolmen.shopr.repository.OrderLineRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class OrderLineService extends CrudService<OrderLine, Long>{
    private BigDecimal totalPrice;

    @Inject
    private OrderLineRepository orderLineRepository;

    @Override
    CrudRepository<OrderLine, Long> getRepository() {
        return orderLineRepository;
    }

//    public OrderLine findOrderLineById(Long orderlineId) {
//        return orderLineRepository.findByOrderLineId(orderlineId);
//    }
//
//    public List<OrderLine> findAllOrderLines() {
//        return orderLineRepository.findAll();
//    }
//
//    public void insert(OrderLine orderLine) {
//        orderLineRepository.insert(orderLine);
//    }
//
//    public void removeByOrderlineId(Long orderlineId) {
//        OrderLine orderLine = orderLineRepository.findByOrderLineId(orderlineId);
//        orderLineRepository.remove(orderLine);
//    }

    public BigDecimal calculateSubtotal(BigDecimal quantity, BigDecimal price) {
        return quantity.multiply(price);
    }

    public BigDecimal calculateTotalPrice(ArrayList<OrderLine> sessionorderLines) {
        Double tusentotaal = new Double(0.00);
        for (OrderLine orderLine : sessionorderLines) {
            tusentotaal = tusentotaal + orderLine.getSubTotal().doubleValue();
        }
        this.totalPrice = BigDecimal.valueOf(tusentotaal);
        return this.totalPrice;
    }
}
