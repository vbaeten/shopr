package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class UserController implements Serializable {

    @Inject
    private UserService userService;

    private User loggedInUser = new User();

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public List<User> getUsers(){
        return this.userService.findAllUsers();
    }

    public void removeUserById(int userId) {
        this.userService.removeUserByUserId(userId);
    }

}
