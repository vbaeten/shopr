package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

@ManagedBean
@RequestScoped
public class RegistrationController {

    @Inject
    private UserService userService;

    private User newUser = new User();

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public void submit(){
        userService.insert(newUser);
    }
}
