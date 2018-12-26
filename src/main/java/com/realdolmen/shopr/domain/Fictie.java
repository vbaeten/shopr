package com.realdolmen.shopr.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="fictie")
public class Fictie extends Boek
{

EnumFictieGenre enumFictieGenre;

}
