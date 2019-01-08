package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.domain.FictionGenre;
import com.realdolmen.shopr.service.FictionService;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@ViewScoped
public class FictionController {
    Fiction newFiction = new Fiction();
    int fictionId;

    @Inject
    private FictionService fictionService;

    public void init(){
        newFiction = getFictionById(fictionId);
    }

    public Fiction getNewFiction(){
        return newFiction;
    }

    public void setNewFiction(Fiction fiction){
        this.newFiction = fiction;
    }

    public List<Fiction> getFictions(){
        return this.fictionService.findAllFictions();
    }

    public void submit(){
        this.fictionService.insert(newFiction);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item successfully created", newFiction.getTitle()));
        this.newFiction = new Fiction();
    }

    public Fiction getFictionById(int id){
        return newFiction = fictionService.findFictionById(id);
    }

    public int getFictionId() {
        return fictionId;
    }

    public void setFictionId(int fictionId) {
        this.fictionId = fictionId;
    }

    public FictionGenre[] getFictionGenre() { return FictionGenre.values(); }

    public String delete(){
        fictionService.delete(newFiction);
        newFiction = new Fiction();
        return "fictionDataTable?faces-redirect=true";
    }

    public void update(){
        this.fictionService.update(newFiction);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Item successfully updated", newFiction.getTitle()));
    }


}
