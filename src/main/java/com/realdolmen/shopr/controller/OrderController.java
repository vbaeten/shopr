package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.OrderService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@SessionScoped
public class OrderController {

    @Inject
    private OrderService orderService;
    @Inject
    private OrderLineService orderLineService;
    private int id;
    private Order order=new Order();




    public void findAllOrderLines(){
        this.orderLineService.getOrderLines();
    }

    public void placeOrder(List<OrderLine> order){
        this.orderService.submitOrder(order);

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
