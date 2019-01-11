package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.OrderLine;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.OrderLineService;
import com.realdolmen.shopr.service.OrderService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class OrderController implements Serializable {
    private User currentUser;
    private Order order;
    private List<OrderLine> orderLines = new ArrayList<>();
    private Double orderTotalPrice;

    @Inject
    private OrderService orderService;
    @Inject
    private OrderLineService orderLineService;
    @Inject
    private LoginController loginController;

    @PostConstruct
    private void init() {
        this.currentUser = getCurrentUser();
        this.order = getOrder();
    }

    public String confirm() {
        orderService.confirmOrder(order);
        order = orderService.createNewOrderAndSetUser(currentUser);
        return "/index.xhtml?faces-redirect=true";
    }

    public void cancel() {

    }

    private User getCurrentUser() {
        return loginController.getCurrentUser();
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public Order getOrder() {
        return orderService.getCorrectOrderInstance(order, currentUser);
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public List<OrderLine> getOrderLines() {
        return orderLineService.findAllOrderLinesByOrderId(order.getId());
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public Double getOrderTotalPrice() {
        this.orderTotalPrice = orderService.calculateOrderTotalPrice(orderLines);
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }
}
