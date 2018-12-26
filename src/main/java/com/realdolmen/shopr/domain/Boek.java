package com.realdolmen.shopr.domain;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@MappedSuperclass
public class Boek extends Artikel {
    private int Id;
    private  String Auteur;
    private int NumberOfPages;

    @Override
    public int getId() {
        return Id;
    }



    public String getAuteur() {
        return Auteur;
    }

    public void setAuteur(String auteur) {
        Auteur = auteur;
    }

    public int getNumberOfPages() {
        return NumberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        NumberOfPages = numberOfPages;
    }
}
