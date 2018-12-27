package com.realdolmen.shopr.domain;

import javax.persistence.*;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Non-fictie")
public class BoekNonFiction extends Boek {


    @Enumerated(EnumType.STRING)
    protected BoekGenreFictie Boekgenre;

}
