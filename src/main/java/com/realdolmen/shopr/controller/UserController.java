package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;
import java.security.PrivateKey;
import java.util.List;

@ManagedBean
@SessionScoped
public class UserController implements Serializable {

    @Inject
    private UserService userService;

    private User selectedUser = new User();

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public List<User> getUsers() {
        return this.userService.findAllUsers();
    }

    public void remove(int id) {
        this.userService.removeById(id);
    }


}
