package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.service.FictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class FictionController {

    private Fiction newFiction = new Fiction();

    @Inject
    private FictionService fictionService;

    public Fiction getNewFiction() {
        return newFiction;
    }

    public void setNewFiction(Fiction newFiction) {
        this.newFiction = newFiction;
    }

    public List<Fiction> getAllFiction(){
        return this.fictionService.findAllFiction();
    }

    public void submitFiction() {
        this.fictionService.insertFiction(newFiction);
        newFiction = new Fiction();
    }

    public void deleteFiction(int id){
        this.fictionService.deleteFiction(id);
    }

}
