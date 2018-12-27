package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginController
{
    private User currentUser = new User();

    public void setCurrentUser(User user)
    {
        currentUser = user;
    }
}
