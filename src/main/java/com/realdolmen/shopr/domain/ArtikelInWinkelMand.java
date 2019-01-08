package com.realdolmen.shopr.domain;


public class ArtikelInWinkelMand
{
private Artikel artikel = new Artikel();
private int aantal;

    public ArtikelInWinkelMand()
    {
    }

    public ArtikelInWinkelMand(Artikel artikel, int aantal)
    {
        this.artikel = artikel;
        this.aantal = aantal;
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
