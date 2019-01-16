package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Fiction;
import com.realdolmen.shopr.domain.FictionGenre;
import com.realdolmen.shopr.service.FictionService;
import org.omnifaces.cdi.ViewScoped;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CuFictionController implements Serializable {
    private Fiction fiction;
    private Long id;

    @Inject
    private FictionService fictionService;

    public void init() {
        if (id == null) {
            fiction = new Fiction();
        } else {
            fiction = fictionService.findFictionById(id);
        }
    }

    public String submit() {
        if (id == null) {
            fictionService.insert(fiction);
            fiction = new Fiction();
        } else {
            fictionService.update(fiction);
        }
        return "/overview/books.xhtml?faces-redirect=true";
    }

    public FictionGenre[] getFictionGenres() {
        return FictionGenre.values();
    }

    public Fiction getFiction() {
        return fiction;
    }

    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
