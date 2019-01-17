package com.realdolmen.shopr.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class ArtikelLijnInBestelling implements Serializable
{


    private int id;
    private Artikel artikel = new Artikel();
    private int aantal;
    private int totaalBedragLijn;


}