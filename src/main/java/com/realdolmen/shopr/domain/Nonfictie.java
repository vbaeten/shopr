package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "nonFictie")
public class Nonfictie extends Boek
{
    @Column
    EnumNonFictieGenre enumNonFictieGenre;
    @Column
    public EnumNonFictieGenre getEnumNonFictieGenre()
    {
        return enumNonFictieGenre;
    }

    public void setEnumNonFictieGenre(EnumNonFictieGenre enumNonFictieGenre)
    {
        this.enumNonFictieGenre = enumNonFictieGenre;
    }
}
