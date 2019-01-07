package com.realdolmen.shopr.beans;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.service.NonFictionService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class NonFictionDetailBean {

    private int id;
    private NonFiction nonFiction;

    @Inject
    private NonFictionService nonFictionService;

    public void init() {
        getNonFictionById(id);
    }

    public void getNonFictionById(int id) {
        nonFiction = nonFictionService.findNonFictionById(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NonFiction getNonFiction() {
        return nonFiction;
    }

    public void setNonFiction(NonFiction nonFiction) {
        this.nonFiction = nonFiction;
    }
}
