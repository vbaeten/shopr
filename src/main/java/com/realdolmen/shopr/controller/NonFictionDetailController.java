package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.domain.Subject;
import com.realdolmen.shopr.service.NonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ViewScoped
@ManagedBean
public class NonFictionDetailController {


    private NonFiction nonFiction;
    private int id;


    @Inject
    private NonFictionService nonFictionService;



    public void init(){

        getFictionById(id);
    }


    private void getFictionById(int id){
        nonFiction =  nonFictionService.findById(id);
    }

    public String delete(){
        nonFiction = this.nonFictionService.findById(id);
        this.nonFictionService.delete(nonFiction);

        return "/overview-pages/nonFiction-overview.xhtml?faces-redirect=true";
    }

    public String update() {

        this.nonFictionService.update(nonFiction);

        return "/overview-pages/nonFiction-overview.xhtml?faces-redirect=true";
    }
    public Subject[] getSubjects() {
        return Subject.values();
    }





    public NonFiction getNonFiction() {
        return nonFiction;
    }

    public void setNonFiction(NonFiction nonFiction) {
        this.nonFiction = nonFiction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
