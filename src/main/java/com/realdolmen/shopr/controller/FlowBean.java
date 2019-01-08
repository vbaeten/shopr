package com.realdolmen.shopr.controller;

import org.primefaces.event.FlowEvent;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.time.LocalDate;

@ManagedBean
@ViewScoped
public class FlowBean {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String zip;
    private String country;

    public String onFlowProcess(FlowEvent event) {
            return event.getNewStep();
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
