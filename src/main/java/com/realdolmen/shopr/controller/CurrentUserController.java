package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.service.UserService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

import com.realdolmen.shopr.domain.User;

@ManagedBean
@SessionScoped
public class CurrentUserController implements Serializable {

    private User currentUser = new User();

    @Inject
    private UserService userService;





    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public List<User> getUsers() {
        return this.userService.findAllUsers();
    }

    public void remove(long id) {
        this.userService.removeById(id);
    }




}