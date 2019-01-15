package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;


import javax.enterprise.context.SessionScoped;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class UserController implements Serializable {

    private User newUser = new User();
    private User currentUser;
    private int id;

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
        newUser = new User();
    }

    public void login(){
        this.currentUser = this.userService.getUserById(id);
    }

    public void logout(){

        currentUser = null;
    }

    public void delete(int id) {
        this.userService.delete(id);
    }


    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
