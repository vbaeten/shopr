package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ArticleService;
import com.realdolmen.shopr.service.OrderLineService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@SessionScoped
public class OrderLineController {

    @Inject
    private OrderLineService orderLineService;

    private ArticleService articleService;

    private OrderLine orderLine = new OrderLine();

    public void initDetailView(Long orderlineId) {
        this.orderLine = orderLineService.findOrderLineById(orderlineId);
    }

    public String createOrderLine(int quantity){
        OrderLine orderLine = new OrderLine();
        orderLine.setQuantity(quantity);
        this.orderLine = orderLine;
        return "orderlineselected";
    }

    public List<OrderLine> getOrderLines() {
        return this.orderLineService.findAllOrderLines();
    }

    public void add(OrderLine orderLine) {
        this.orderLineService.insert(orderLine);
    }

    public OrderLine getOrderLinebyId(Long orderlineId) {
        return orderLineService.findOrderLineById(orderlineId);
    }

    public String removeOrderLine(OrderLine orderLine) {
        orderLineService.removeByOrderlineId(orderLine.getOrderlineId());
        return "overview";
    }

    public OrderLine getOrderLine() {
        return this.orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
