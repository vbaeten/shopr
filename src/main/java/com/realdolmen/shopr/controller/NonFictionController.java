package com.realdolmen.shopr.controller;


import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.domain.Subject;
import com.realdolmen.shopr.service.NonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class NonFictionController {

    private NonFiction newNonFiction = new NonFiction();

    @Inject
    private NonFictionService nonFictionService;

    public Subject[] getSubjects(){
        return Subject.values();
    }

    public void submit(){
        this.nonFictionService.insert(newNonFiction);
    }


    public NonFiction getNewNonFiction() {
        return newNonFiction;
    }

    public void setNewNonFiction(NonFiction newNonFiction) {
        this.newNonFiction = newNonFiction;
    }
}
