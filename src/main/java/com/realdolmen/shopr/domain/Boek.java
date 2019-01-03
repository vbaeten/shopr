package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "boek")
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "boekType")
@DiscriminatorValue("boek")
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries(
        {
                @NamedQuery(
                        name = Boek.FIND_BY_ID,
                        query = "SELECT b FROM Boek b WHERE b.id = :id"
                ),
                @NamedQuery(
                        name = Boek.FIND_ALL,
                        query = "SELECT b FROM Boek b"
                )
        }
)
public class Boek extends Artikel {
    public static final String FIND_ALL = "Boek.findAll";
    public static final String FIND_BY_ID = "Boek.findById";

    @Size(max = 100)
    @Column(name = "auteur")
    private String auteur;
    @NotNull
    @Column(name = "isbn", unique = true)
    @Pattern(regexp = "\\d{3}-\\d{2}-\\d{4}-\\d{3}-\\d{1}")
    private String isbn;
    @Column(name = "aantal_paginas")
    private int aantalPaginas;
    @Column(insertable = false, updatable = false)
    private String boekType;

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

    public String getBoekType() {
        return boekType;
    }

    public void setBoekType(String boekType) {
        this.boekType = boekType;
    }
}
