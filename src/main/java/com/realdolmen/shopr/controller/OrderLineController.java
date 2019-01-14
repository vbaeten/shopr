package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ItemService;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.OrderService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class OrderLineController {


    private Order order = new Order();
    private Item item;
    private OrderLine orderLine;
    private short quantity;
    private List<OrderLine> orderLines = new ArrayList<>();

    @Inject
    private OrderService orderService;
    @Inject
    private OrderLineService orderLineService;
    @Inject
    private ItemService itemService;



    public List<OrderLine> getOrderLines(){
        return this.orderLineService.getOrderLines();
    }


    public void addToCart(int id){

        orderLine = new OrderLine();
        item = itemService.getById(id);
        orderLine.setItem(item);
        orderLine.setQuantity(quantity);
        orderLines.add(orderLine);
        this.orderLineService.submit(orderLine);
        order.setOrderLines(orderLines);
        orderLine = new OrderLine();
    }


    public String placeOrder(){
        order = new Order();
        order.setOrderLines(orderLines);
        orderService.submitOrder(order);
        orderLines = orderLineService.getOrderLines();
        orderLines.clear();
        return "/overview-pages/thankyou-page.xhtml?faces-redirect=true";
    }




    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }


    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
