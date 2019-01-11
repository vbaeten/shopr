package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ItemService;
import com.realdolmen.shopr.service.OrderLineService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class OrderLineController {



    private Item item;
    private OrderLine orderLine=new OrderLine();
    private short quantity;

    @Inject
    private OrderLineService orderLineService;
    @Inject
    private ItemService itemService;


    public List<OrderLine> getOrderLines(){
        return this.orderLineService.getOrderLines();
    }


    public void addToCart(int id){
        item = itemService.getById(id);
        orderLine.setItem(item);
        orderLine.setQuantity(quantity);
        this.orderLineService.submit(orderLine);
    }


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }



    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
}
