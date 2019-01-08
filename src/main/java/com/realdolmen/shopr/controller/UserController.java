package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Order;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class UserController implements Serializable {
    private User newUser = new User();
    private User currentUser;
    private Order currentOrder = new Order();
    private Long id;

    @Inject
    private UserService userService;

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
        currentUser = this.userService.findUserById(id);
        currentOrder.setUser(currentUser);
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

    public Order getCurrentOrder() {
        return currentOrder;
    }

    public void setCurrentOrder(Order currentOrder) {
        this.currentOrder = currentOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
