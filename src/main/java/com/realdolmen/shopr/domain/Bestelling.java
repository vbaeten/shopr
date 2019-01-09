package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
public class Bestelling {
    @Id
    @GeneratedValue
    private long Id;
    private Date datumBestelling;
    @OneToMany
    private List<Artikel> Artikel= new ArrayList();
    @ManyToOne
    private User user;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Date getDatumBestelling() {
        return datumBestelling;
    }

    public void setDatumBestelling(Date datumBestelling) {
        this.datumBestelling = datumBestelling;
    }

    public List<com.realdolmen.shopr.domain.Artikel> getArtikel() {
        return Artikel;
    }

    public void setArtikel(List<com.realdolmen.shopr.domain.Artikel> artikel) {
        Artikel = artikel;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
