package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("fictie")
public class BoekFiction extends Boek {
    @Column
    private String Inhoud;
    @Enumerated(EnumType.STRING)
    protected BoekGenreFictie Boekgenre;
}
