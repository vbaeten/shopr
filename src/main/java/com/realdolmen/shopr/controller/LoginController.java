package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginController {

    private User currentUser = new User();
    private UserService userService;
    private int id;


    public void login(){
        currentUser = this.userService.getUserById(id);
    }

    public void logout(){
        this.id=0;
        currentUser = new User();

    }




    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }
}
