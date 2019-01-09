package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.ShoppingCartService;
import com.realdolmen.shopr.service.UserService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    private int id;
    private User loggedUser = null;

    private ShoppingCart shoppingCart;

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Inject
    private UserService userService;
    @Inject
    private ShoppingCartService shoppingCartService;


    @PostConstruct
    public void init() {
        getUserById(id);
    }

    public void getUserById(int id) {
        loggedUser = userService.findUserById(id);
    }

    public void login(int id) {
        this.loggedUser = userService.findUserById(id);
        this.shoppingCart = shoppingCartService.findShoppingCartById(id);
        System.out.println(this.loggedUser);
    }

    public void logout() {
        this.loggedUser = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User user) {
        this.loggedUser = user;
    }
}
