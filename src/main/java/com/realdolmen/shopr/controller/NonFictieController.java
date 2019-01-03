package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFictie;
import com.realdolmen.shopr.service.NonFictieService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import java.util.List;

@ManagedBean
@RequestScoped
public class NonFictieController {
    private NonFictie nonFictie = new NonFictie();

    @Inject
    private NonFictieService nonFictieService;

    public String gotoDetails(NonFictie nonFictie) {
        this.nonFictie = nonFictie;
        return "nonFictieDetails";
    }

    public NonFictie getNonFictie() {
        return nonFictie;
    }

    public void setNonFictie(NonFictie nonFictie) {
        this.nonFictie = nonFictie;
    }

    public NonFictie findById(int id) {
        return this.nonFictieService.findById(id);
    }

    public List<NonFictie> findAll() {
        return this.nonFictieService.findAll();
    }

    public void removeById(int id) {
        this.nonFictieService.removeById(id);
    }

    public void submit(NonFictie nonFictie) {
        this.nonFictieService.insert(nonFictie);
    }

}
