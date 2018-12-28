package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ManagedBean
@SessionScoped
public class LoginController
{
    @PersistenceContext
    EntityManager entityManager;

    private User currentUser;

    public void setCurrentUser(User user)
    {
        this.currentUser = user;
    }

    public List<User> findAllUsers()
    {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    public User getCurrentUser()
    {
        return currentUser;
    }
}
