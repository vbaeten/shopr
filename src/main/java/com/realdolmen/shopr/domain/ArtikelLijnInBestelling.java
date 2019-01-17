package com.realdolmen.shopr.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ArtikelLijnInBestelling implements Serializable
{


    private int id;
    private Artikel artikel = new Artikel();
    private int aantal;
    private int totaalBedragLijn;


}