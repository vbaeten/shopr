package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.ShoppingCartService;
import com.realdolmen.shopr.service.UserService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    private int id;

    private User loggedUser = null;


    @Inject
    private UserService userService;


    @PostConstruct
    public void init() {
        loggedUser = userService.findUserById(id);
    }

    public void login(int id) {
        this.loggedUser = userService.findUserById(id);
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
