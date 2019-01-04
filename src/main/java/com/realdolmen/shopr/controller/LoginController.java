package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.security.Principal;
import java.util.Map;
import java.util.logging.Logger;

@ManagedBean
@SessionScoped
public class LoginController implements Serializable {

    private static Logger log = Logger.getLogger(LoginController.class.getName());

    @Inject
    private UserService userService;

//    @ManagedProperty("#{logged_user}")
    private User loggedUser;

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    private int id;
    private String name;
    private String firstName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @PostConstruct
    private void init() {
        this.loggedUser = new User();
    }

    public void login(User user) {
        this.loggedUser = user;
    }

//    public String logout() {
//        loggedUser = new User();
//        return "/index.xhtml";
//    }
//
//    public boolean isLoggedIn(){
//        if( loggedUser == null){
//            return false;
//        } else {
//            return true;
//        }
//    }
}
