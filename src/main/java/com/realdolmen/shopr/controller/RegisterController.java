package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean
@RequestScoped
public class RegisterController {

    private User user = new User();
    private int id;

    @Inject
    private UserService userService;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void submit() {
       this.userService.insert(user);
    }
}
