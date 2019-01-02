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
    public String userName;

    public void setCurrentUser(int id)
    {
        this.currentUser = entityManager.find(User.class, id);
        this.userName = currentUser.getName();

    }

//    public List<User> findAllUsers()
//    {
//        return entityManager.createQuery("select u from User u", User.class).getResultList();
//    }

    public User getCurrentUser()
    {
        return currentUser;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }
}
