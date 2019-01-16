package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.NonFiction;
import com.realdolmen.shopr.domain.NonFictionSubject;
import com.realdolmen.shopr.service.NonFictionService;
import org.omnifaces.cdi.ViewScoped;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CuNonFictionController implements Serializable {
    private NonFiction nonFiction;
    private Long id;

    @Inject
    private NonFictionService nonFictionService;

    public void init() {
        if (id == null) {
            nonFiction = new NonFiction();
        } else {
            nonFiction = nonFictionService.findNonFictionById(id);
        }
    }

    public String submit() {
        if (id == null) {
            nonFictionService.insert(nonFiction);
            nonFiction = new NonFiction();
        } else {
            nonFictionService.update(nonFiction);
        }
        return "/overview/books.xhtml?faces-redirect=true";
    }

    public NonFictionSubject[] getNonFictionSubjects() {
        return NonFictionSubject.values();
    }

    public NonFiction getNonFiction() {
        return nonFiction;
    }

    public void setNonFiction(NonFiction nonFiction) {
        this.nonFiction = nonFiction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
