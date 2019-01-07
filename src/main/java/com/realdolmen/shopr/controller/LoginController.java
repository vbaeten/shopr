package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.EnumRoles;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;

import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.io.Serializable;


@ManagedBean
@SessionScoped
public class LoginController implements Serializable
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
        this.currentUser = userService.findUserById(id);
        setEnumRoles(currentUser.getRole());
        setCurrentUserName(currentUser.getFirstName());

        return "/index.xhtml?faces-redirect=true" ;

    }
    public User getCurrentUser()

    {
        return this.currentUser;
    }

    public String logout()
    {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index?faces-redirect=true";



    }


}
