package com.realdolmen.shopr.domain;

import javax.persistence.*;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)

                @NamedQuery(
                        name = Artikel.FIND_ALL,
                        query = "SELECT u FROM Artikel u"
                )


public   class Artikel {
    public static final String FIND_ALL = "Artikel.findAll";
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
