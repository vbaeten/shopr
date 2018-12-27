package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@MappedSuperclass
public abstract  class Artikel {
    @Id
    @GeneratedValue
    private int id;

    private String Titel;
    private int price;
    private String leverancier;

    public int getId() {
        return id;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLeverancier() {
        return leverancier;
    }

    public void setLeverancier(String leverancier) {
        this.leverancier = leverancier;
    }
}
