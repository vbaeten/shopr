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

@ManagedBean
@SessionScoped
public class UserController
{

    private User newUser = new User();

    private boolean newUserPanel = false;


    @Inject
    private UserService userService;
    @Inject
    private RatingService ratingService;
    @Inject
    private RatingController ratingController;


    public boolean isNewUserPanel()
    {
        return newUserPanel;
    }

    public void setNewUserPanel(boolean newUserPanel)
    {
        this.newUserPanel = newUserPanel;
    }

    public User getNewUser()
    {
        return newUser;
    }

    public void setNewUser(User newUser)
    {
        this.newUser = newUser;
    }

    public List<User> getUsers()
    {
        return this.userService.findAllUsers();
    }

    public void submit()
    {
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

    public void userToevoegen()
    {
        this.newUserPanel = false;
        userService.insert(this.newUser);
    }

    public void ladenPanel()
    {
        this.newUserPanel = true;
    }

    public void terug()
    {
        this.newUserPanel = false;
    }



}
