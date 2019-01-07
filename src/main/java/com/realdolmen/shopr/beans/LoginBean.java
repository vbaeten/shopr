package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

@ManagedBean
@SessionScoped
public class LoginBean {

    private int id;
    private User user;

    @Inject
    private UserService userService;

    public void init(int id) {
        getUserById(id);
    }

    private void getUserById(int id) {
        user = userService.findUserById(id);
    }


}
