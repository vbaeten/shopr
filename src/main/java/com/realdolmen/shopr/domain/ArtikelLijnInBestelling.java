package com.realdolmen.shopr.domain;

public class ArtikelLijnInBestelling
{


    private int id;
    private Artikel artikel = new Artikel();
    private int aantal;
    private int totaalBedragLijn;

    public ArtikelLijnInBestelling()
    {
    }

    public int getTotaalBedragLijn()
    {
        return totaalBedragLijn;
    }

    public void setTotaalBedragLijn(int totaalBedragLijn)
    {
        this.totaalBedragLijn = totaalBedragLijn;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Artikel getArtikel()
    {
        return artikel;
    }

    public void setArtikel(Artikel artikel)
    {
        this.artikel = artikel;
    }

    public int getAantal()
    {
        return aantal;
    }

    public void setAantal(int aantal)
    {
        this.aantal = aantal;
    }
}
