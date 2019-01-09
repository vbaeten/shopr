package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Beoordeling;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.RatingService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@SessionScoped
public class UserController {

    private User newUser = new User();


    @Inject
    private UserService userService;
    @Inject
    private RatingService ratingService;
    @Inject
    private RatingController ratingController;



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
    }

    public void delete(int id)
    {
       this.ratingService.deleteRatingsUser(id);
        this.userService.delete(id);
    }

    public void update(User user)
    {
        this.userService.update(user);
    }

    public void ratingsUsers(int id)
    {
        ratingController.ratingsUser = ratingService.findAllBeoordelingenByUserId(id);
    }


}
