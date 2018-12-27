package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;


@DiscriminatorValue(value = "fictie")
public class Fictie extends Boek
{
    @Column(name="genre")
    EnumFictieGenre enumFictieGenre;
    @Size(max=255)
    @Column
    private String korteInhoud;

    public EnumFictieGenre getEnumFictieGenre()
    {
        return enumFictieGenre;
    }

    public void setEnumFictieGenre(EnumFictieGenre enumFictieGenre)
    {
        this.enumFictieGenre = enumFictieGenre;
    }

    public String getKorteInhoud()
    {
        return korteInhoud;
    }

    public void setKorteInhoud(String korteInhoud)
    {
        this.korteInhoud = korteInhoud;
    }
}
