package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.OrderService;
import com.realdolmen.shopr.service.UserService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class LoginController implements Serializable {
    private User newUser = new User();
    private User currentUser;
    private Order order;
    private Long id;

    @Inject
    private UserService userService;
    @Inject
    private OrderService orderService;

    public List<User> getUsers() {
        return this.userService.findAllUsers();
    }

    public void submit() {
        this.userService.insert(newUser);
        newUser = new User();
    }

    public void deleteNewUser() {
        this.userService.delete(this.id);
    }

    public String logIn() {
        currentUser = userService.findUserById(id);
        order = orderService.getCorrectOrderInstance(order, currentUser);
        return "/overview/items.xhtml?faces-redirect=true";
    }

    public String logOut() {
        currentUser = new User();
        return "index.xhtml?faces-redirect=true";
    }

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
