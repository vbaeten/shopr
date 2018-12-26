package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "LP")
public class Lp extends Artikel
{

    @Size(max=100)
    @NotNull
    @Column
    private String uitvoerder;
    @NotNull
@Column
    EnumMuziekGenre enumMuziekGenre;

    public String getUitvoerder()
    {
        return uitvoerder;
    }

    public void setUitvoerder(String uitvoerder)
    {
        this.uitvoerder = uitvoerder;
    }

    public EnumMuziekGenre getEnumMuziekGenre()
    {
        return enumMuziekGenre;
    }

    public void setEnumMuziekGenre(EnumMuziekGenre enumMuziekGenre)
    {
        this.enumMuziekGenre = enumMuziekGenre;
    }
}
