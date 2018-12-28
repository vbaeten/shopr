package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class UserController {
    private User newUser = new User();
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

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
