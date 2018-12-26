package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue(value = "fictie")
public class Fictie extends Boek
{
    @Column
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
