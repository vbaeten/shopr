package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ItemService;
import com.realdolmen.shopr.service.OrderLineService;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class OrderLineController {
    private OrderLine newOrderLine = new OrderLine();
    private Long id;
    private Item item;
    private Order order;

    @Inject
    private OrderLineService orderLineService;
    @Inject
    private ItemService itemService;
    @Inject
    private UserController userController;

    public void submit(Long id) {
        order = userController.getCurrentOrder();
        item = itemService.findItemById(id);
        newOrderLine.setItem(item);
        newOrderLine.setOrder(order);
        orderLineService.insert(newOrderLine);
        newOrderLine = new OrderLine();
    }

    public OrderLine getNewOrderLine() {
        return newOrderLine;
    }

    public void setNewOrderLine(OrderLine newOrderLine) {
        this.newOrderLine = newOrderLine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
