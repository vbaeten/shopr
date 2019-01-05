package com.realdolmen.shopr.controller;

import org.primefaces.event.FlowEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class FlowBean {
//    private User user = new User();

    private boolean skip;

//    public User getUser() {
//        return user;
//    }

//    public void setUser(User user) {
//        this.user = user;
//    }

//    public void save() {
//        FacesMessage msg = new FacesMessage("Successful", "Welcome :" + user.getFirstname());
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip(boolean skip) {
        this.skip = skip;
    }

    public String onFlowProcess(FlowEvent event) {
        if(skip) {
            skip = false;   //reset in case user goes back
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }
}
