package com.realdolmen.shopr.domain;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bestelling")
public class Bestelling {

    @Id
    @GeneratedValue
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datum_van_bestelling")
    private Date datumVanBestelling;

    @ManyToMany
    private List<Artikel> artikels;

    @Transient
    //@ManyToOne
    private User user;


    public int getId() {
        return id;
    }

    public Date getDatumVanBestelling() {
        return datumVanBestelling;
    }

    public void setDatumVanBestelling(Date datumVanBestelling) {
        this.datumVanBestelling = datumVanBestelling;
    }

    public List<Artikel> getArtikels() {
        return artikels;
    }

    public void setArtikels(List<Artikel> artikels) {
        this.artikels = artikels;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
