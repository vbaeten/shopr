package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;


@ManagedBean
@SessionScoped
public class LoginController {

    private User currentUser = new User();

    @Inject
    private UserService userService = new UserService();

    private int id;


    public void login(){
        this.currentUser = this.userService.getUserById(id);

    }

    public void logout(){

        currentUser = new User();

    }




    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
