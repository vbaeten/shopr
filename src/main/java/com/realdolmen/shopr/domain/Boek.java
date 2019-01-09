package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by TLMBM39 on 26/12/2018.
 */

@Entity
@Table(name = "Boek")
@DiscriminatorValue("Boek")
@Inheritance(strategy = InheritanceType.JOINED)


public  abstract class Boek extends Artikel implements Serializable{

    @Column
    private  String Auteur;
    @Column
    private int NumberOfPages;
    @Column
    private String ISBN;



    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
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
