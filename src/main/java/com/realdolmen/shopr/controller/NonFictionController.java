package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.service.NonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class NonFictionController {
    NonFiction newNonFiction = new NonFiction();

    @Inject
    private NonFictionService nonFictionService;

    public NonFiction getNewNonFiction(){
        return newNonFiction;
    }

    public void setNewNonFiction(NonFiction nonFiction){
        this.newNonFiction = nonFiction;
    }

    public List<NonFiction> getNonFictions(){
        return this.nonFictionService.findAllNonFictions();
    }

    public void submit(NonFiction nonFiction){
        this.nonFictionService.insert(nonFiction);
    }
}
