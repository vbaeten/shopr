package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@SessionScoped
public class UserController {

    private User newUser = new User();

    @Inject
    private UserService userService;

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public List<User> getUsers(){
        return this.userService.findAllUsers();
    }

    public void submit(){
        this.userService.insert(newUser);
    }

}
