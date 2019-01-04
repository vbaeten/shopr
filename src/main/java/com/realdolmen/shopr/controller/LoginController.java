package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.EnumRoles;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;
import java.io.Console;
import java.util.List;

@ManagedBean
@SessionScoped
public class LoginController
{
    @Inject
    UserService userService;

    private User currentUser;
    private String currentUserName;
    private EnumRoles enumRoles;
    private int id;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

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
    }

    public String loggedIn()
    {
        currentUser = userService.findUserById(id);
        setEnumRoles(currentUser.getRole());
        setCurrentUserName(currentUser.getFirstName());

        return "/index.xhtml?faces-redirect=true" ;

    }

    public User getCurrentUser()
    {
        return currentUser;
    }

    public String logout()
    {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index?faces-redirect=true";
//        currentUser = new User();
//        loggedIn();
//        return "login.xhtml?faces-redirect=true";


    }


}
