package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue(value = "fictie")
@NamedQueries({
        @NamedQuery(name = Fictie.FIND_ALL,
                query = "select f from Fictie f"),
        @NamedQuery(name= Fictie.FIND_BY_NAME,
                query = "select f from Fictie f where f.titel=:titel")})
public class Fictie extends Boek
{
    public static final String FIND_ALL = "Fictie.findAll";
    public static final String FIND_BY_NAME = "Fictie.findByTitel";


    @Column(name="genre")
    @Enumerated(EnumType.STRING)
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
