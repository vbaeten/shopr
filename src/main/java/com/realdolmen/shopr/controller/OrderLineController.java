package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Item;
import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.service.ItemService;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.OrderService;
import com.realdolmen.shopr.service.UserService;

import javax.enterprise.context.RequestScoped;
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
    private OrderService orderService;
    @Inject
    private OrderLineService orderLineService;
    @Inject
    private ItemService itemService;
    @Inject
    private UserService userService;
    @Inject
    private LoginController loginController;

    public String submit(Long id) {
        return isLoggedIn(id);
    }

    private String isLoggedIn(Long id) {
        order = orderService.getCorrectOrderInstance(order, loginController.getCurrentUser());
        if (order == null) {
            return executeRedirect();
        } else {
            return executeSubmit(id);
        }
    }

    private String executeRedirect() {
        return "/login.xhtml?faces-redirect=true";
    }

    private String executeSubmit(Long id) {
        setItemToOrderLine(id);
        setOrderToOrderLine(newOrderLine);
        orderLineService.insert(newOrderLine);
        newOrderLine = new OrderLine();
        return null;
    }

    private void setItemToOrderLine(Long id) {
        item = itemService.findItemById(id);
        newOrderLine.setItem(item);
    }

    private void setOrderToOrderLine(OrderLine orderLine) {
        newOrderLine.setOrder(this.order);
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
