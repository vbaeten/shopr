package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.BookGenre;
import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.domain.Review;
import com.realdolmen.shopr.domain.User;
import com.realdolmen.shopr.service.FictionService;
import com.realdolmen.shopr.service.ReviewService;
import com.realdolmen.shopr.service.UserService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class FictionDetailController {

//    Todo : REMOVE USERSERVICE AND MOCKED USER AND make everything work with itemcontroller


    private Fiction fiction;
    private int id;


    @Inject
    private FictionService fictionService;

    @Inject

    public void init() {

        getFictionById(id);
    }

    public BookGenre[] getGenres() {
        return BookGenre.values();
    }




    private void getFictionById(int id) {
        fiction = fictionService.findById(id);
    }

    public String delete() {
        fiction = this.fictionService.findById(id);
        this.fictionService.delete(fiction);

        return "/overview-pages/fiction-overview.xhtml?faces-redirect=true";
    }

    public String update() {

        this.fictionService.update(fiction);

        return "/overview-pages/fiction-overview.xhtml?faces-redirect=true";
    }


    public Fiction getFiction() {
        return fiction;
    }

    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
