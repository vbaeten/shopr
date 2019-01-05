package com.realdolmen.shopr.controller;

import org.primefaces.event.FlowEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.time.LocalDate;

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
            skip = false;
            return "confirm";
        }
        else {
            return event.getNewStep();
        }
    }

    public int[] getYears(){
        int year = LocalDate.now().getYear();
        int[] years = new int[15];
        for (int i = 0;i<15;i++){
            years[i] = year+i;
        }
        return years;
    }

    public int[] getMonths(){
        int[] months = new int[12];
        for (int i = 0;i<12;i++){
            months[i] = i+1;
        }
        return months;
    }


}
