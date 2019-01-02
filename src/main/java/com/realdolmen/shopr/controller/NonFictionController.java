package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.domain.NonFictionSubject;
import com.realdolmen.shopr.service.NonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ManagedBean
@ViewScoped
public class NonFictionController {
    NonFiction newNonFiction = new NonFiction();
    int nonFictionId;

    @Inject
    private NonFictionService nonFictionService;

    public void init(){
        newNonFiction = getNonFictionById(nonFictionId);
    }

    public NonFiction getNewNonFiction(){
        return newNonFiction;
    }

    public void setNewNonFiction(NonFiction nonFiction){
        this.newNonFiction = nonFiction;
    }

    public List<NonFiction> getNonFictions(){
        return this.nonFictionService.findAllNonFictions();
    }

    public void submit(){
        this.nonFictionService.insert(newNonFiction);
        newNonFiction = new NonFiction();
    }

    public NonFiction getNonFictionById(int id){
        return newNonFiction = nonFictionService.findNonFictionById(id);
    }

    public int getNonFictionId() {
        return nonFictionId;
    }

    public void setNonFictionId(int nonFictionId) {
        this.nonFictionId = nonFictionId;
    }

    public NonFictionSubject[] getNonFictionSubject() { return NonFictionSubject.values(); }

    public String delete(){
        nonFictionService.delete(newNonFiction.getId());
        newNonFiction = new NonFiction();
        return "nonFictionDataTable?faces-redirect=true";
    }


}
