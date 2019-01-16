package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Lp;
import com.realdolmen.shopr.domain.LpGenre;
import com.realdolmen.shopr.service.LpService;
import org.omnifaces.cdi.ViewScoped;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class CuLpController implements Serializable {
    private Lp lp;
    private Long id;

    @Inject
    private LpService lpService;

    public void init() {
        if (id == null) {
            lp = new Lp();
        } else {
            lp = lpService.findLpById(id);
        }
    }

    public String submit() {
        if (id == null) {
            lpService.insert(lp);
            lp = new Lp();
        } else {
            lpService.update(lp);
        }
        return "/overview/lps.xhtml?faces-redirect=true";
    }

    public LpGenre[] getLpGenres() {
        return LpGenre.values();
    }

    public Lp getLp() {
        return lp;
    }

    public void setLp(Lp lp) {
        this.lp = lp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
