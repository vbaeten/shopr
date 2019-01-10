package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@RequestScoped
public class UserController implements Serializable {

    @Inject
    private UserService userService;

    private User newUser = new User();


    public void submit() {
        userService.insert(newUser);
    }

    public List<User> getUsers() {
        return this.userService.findAllUsers();
    }

    public void remove(int id) {
        this.userService.removeById(id);
    }


    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

}
