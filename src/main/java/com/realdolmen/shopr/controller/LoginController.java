package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.EnumRoles;
import com.realdolmen.shopr.domain.User;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;
import java.io.Console;
import java.util.List;

@ManagedBean
@SessionScoped
public class LoginController
{
    @PersistenceContext
    EntityManager entityManager;
//    @Resource
//    UserTransaction utx;

    private User currentUser;
    private String currentUserName;
    private EnumRoles enumRoles;

    public String getCurrentUserName()
    {
        return currentUserName;
    }

    public void setCurrentUserName(String currentUserName)
    {
        this.currentUserName = currentUserName;
    }

    public EnumRoles getEnumRoles()
    {
        return enumRoles;
    }

    public void setEnumRoles(EnumRoles enumRoles)
    {
        this.enumRoles = enumRoles;
    }

    public LoginController()
    {
//        addUsers();
    }


    public void setCurrentUser(int id )
    {
        this.currentUser = entityManager.find(User.class, id);





    }

    public String loggedIn()
    {
        System.out.println(currentUserName);
        return "/index.xhtml?faces-redirect=true" ;

    }


//    public List<User> findAllUsers(){
//
//
//        return entityManager.createQuery("select u from User u", User.class).getResultList();
//    }

    public User getCurrentUser()
    {
        return currentUser;
    }


}
