package com.realdolmen.shopr.domain;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Boek extends Artikel
{
    private String auteur;
    private String isbn;
    private int aantalPaginas;


    public String getAuteur()
    {
        return auteur;
    }

    public void setAuteur(String auteur)
    {
        this.auteur = auteur;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public int getAantalPaginas()
    {
        return aantalPaginas;
    }

    public void setAantalPaginas(int aantalPaginas)
    {
        this.aantalPaginas = aantalPaginas;
    }
}
