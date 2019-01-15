package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Bestelling;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.BestellingsService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@ViewScoped
public class UserConsoleController
{
    @Inject
    BestellingsService bestellingsService;

    User user;


    public List<Bestelling> bestellingen(User u)
    {
        return bestellingsService.bestellingenUser(u.getId());
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public String naarUserConsole(User user)
    {
        this.user = user;
        return "userConsole";

    }

}

