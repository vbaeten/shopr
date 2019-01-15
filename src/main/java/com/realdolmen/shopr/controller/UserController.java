package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;
import com.realdolmen.shopr.util.ShoprEndpoints;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;
import java.util.List;

@ManagedBean
@SessionScoped
public class UserController implements Serializable {

    @Inject
    private UserService userService;

    private User loggedInUser = new User();

    public List<User> getUsers() {
        return this.userService.findAll();
    }

    public void removeUser(User user) {
        this.userService.remove(user);
    }

    public String sayHello(User loggedInUser) {
        if (loggedInUser.getUserId() != null) {
            return " Hello " + loggedInUser.getFirstName();
        } else {
            return "";
        }
    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().getSessionMap().remove("userController");

        return ShoprEndpoints.INDEX + "?faces-redirect=true";
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

}
