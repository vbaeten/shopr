package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.ShoppingCart;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.ShoppingCartService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class UserController {

    @Inject
    private UserService userService;
    @Inject
    private ShoppingCartService shoppingCartService;

    private User newUser = new User();
    private ShoppingCart shoppingCart = new ShoppingCart();

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
        shoppingCart = new ShoppingCart();
        shoppingCart.setUser(newUser);
        shoppingCartService.insert(shoppingCart);
        newUser = new User();
        shoppingCart = new ShoppingCart();
    }

    public void deleteUser(int id){
        this.userService.deleteUser(id);
    }
}
