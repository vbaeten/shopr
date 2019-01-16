package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class LoginBean implements Serializable {

    private int id;
    private int guestid;

    private User loggedUser = null;
    private User guestUser = null;

    @Inject
    private UserService userService;

    @PostConstruct
    public void init() {
        loggedUser = userService.findUserById(id);
    }

    public void login(int id) {
        this.loggedUser = userService.findUserById(id);
    }

    public void logout() {
        id = 0;
        loggedUser = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User user) {
        this.loggedUser = guestUser;
    }

    public int getGuestid() {
        return guestid;
    }

    public void setGuestid(int guestid) {
        this.guestid = guestid;
    }

    public User getGuestUser() {
        return guestUser;
    }

    public void setGuestUser(User guestUser) {
        this.guestUser = guestUser;
    }
}
