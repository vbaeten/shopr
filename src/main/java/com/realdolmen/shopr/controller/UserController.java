package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

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
        return this.userService.findAllUsers();
    }

    public void removeUserById(int userId) {
        this.userService.removeUserByUserId(userId);
    }

    public String sayHello(User loggedInUser) {
        if (loggedInUser.getUserId() > 0) {
            return " Hello " + loggedInUser.getFirstName();
        } else {
            return "";
        }
    }

    public String logoutUser() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index?faces-redirect=true";
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

}
