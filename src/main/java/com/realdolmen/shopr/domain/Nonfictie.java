package com.realdolmen.shopr.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="nonFictie")
public class Nonfictie extends Boek
{
EnumNonFictieGenre enumNonFictieGenre;

}
