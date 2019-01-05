package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.OrderLineService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.persistence.Entity;

@ViewScoped
@ManagedBean
public class OrderLineController {
    private OrderLine newOrderLine = new OrderLine();

    @Inject
    OrderLineService orderLineService;

    public OrderLine getNewOrderLine() {
        return newOrderLine;
    }

    public void setNewOrderLine(OrderLine newOrderLine) {
        this.newOrderLine = newOrderLine;
    }
}
