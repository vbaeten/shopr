package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.OrderService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class LoginController {

    @Inject
    private UserService userService;
    @Inject
    private OrderService orderService;

    private User selectedUser = new User();

    private Order currentOrder = new Order();




    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
        Order order = new Order(selectedUser);
        orderService.insert(order);
        List<Order> orderList = orderService.findOrdersByUserId(selectedUser.getId());
        currentOrder = orderList.get(0);

    }

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }
}
