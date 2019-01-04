package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Singleton;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class UserController implements Serializable {

    private User newUser = new User();
    private User currentUser = new User();

    @Inject
    private UserService userService;

    public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }

    public List<User> getUsers() {
        return this.userService.findAllUsers();
    }

    public void submit() {
        this.userService.insert(newUser);
    }

    public String gotoArticles() {
        return "articles.xhtml";
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getUserById(int id){
        return this.userService.findUserById(id);
    }
}
