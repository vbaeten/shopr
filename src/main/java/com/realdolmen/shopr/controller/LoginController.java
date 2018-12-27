package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.security.Principal;
import java.util.Map;
import java.util.logging.Logger;

@ManagedBean
@SessionScoped
public class LoginController implements Serializable {

    private static Logger log = Logger.getLogger(LoginController.class.getName());

    @Inject
    private UserService userService;

    private String name;

    private User user;

    public void login() {

        FacesContext context = FacesContext.getCurrentInstance();
        HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();

        Principal principal = request.getUserPrincipal();
        this.user = userService.findUserByName(principal.getName());
        log.info("Authentication done for user: " + principal.getName());
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        Map<String, Object> sessionMap = externalContext.getSessionMap();
        sessionMap.put("User", user);

    }
}
