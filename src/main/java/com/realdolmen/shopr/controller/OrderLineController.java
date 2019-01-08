package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ItemService;
import com.realdolmen.shopr.service.OrderLineService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean
@RequestScoped
public class OrderLineController {



    private Item item;
    private OrderLine orderLine=new OrderLine();

    @Inject
    private OrderLineService orderLineService;
    @Inject
    private ItemService itemService;


    public void addToCart(int id){
        item = itemService.getById(id);
        orderLine.setItem(item);
        this.orderLineService.submit(orderLine);
    }




    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
