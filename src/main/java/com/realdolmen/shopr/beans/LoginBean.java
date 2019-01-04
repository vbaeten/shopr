package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.User;

import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class LoginBean {

    @ManagedProperty("#{param.user}")
    private User user;


}
