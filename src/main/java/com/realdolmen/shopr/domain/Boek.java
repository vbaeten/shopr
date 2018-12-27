package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "boek")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Boek extends Artikel {

    @Size(max = 100)
    @Column(name = "auteur")
    private String auteur;
    @NotNull
    @Column(name = "isbn", unique = true)
    @Pattern(regexp="\\d{3}-\\d{2}-\\d{4}-\\d{3}-\\d{1}")
    private String isbn;
    @Column(name = "aantal_pagina's")
    private  int aantalPaginas;

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAantalPaginas() {
        return aantalPaginas;
    }

    public void setAantalPaginas(int aantalPaginas) {
        this.aantalPaginas = aantalPaginas;
    }
}
