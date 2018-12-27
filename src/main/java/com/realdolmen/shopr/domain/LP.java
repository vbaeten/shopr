package com.realdolmen.shopr.domain;

import javax.persistence.*;

/**
 * Created by TLMBM39 on 26/12/2018.
 */
@Entity
@Table(name = "LP")
@DiscriminatorValue("LP")
@Inheritance(strategy = InheritanceType.JOINED)
public class LP extends Artikel {
    private String UitvoerderTitel;

    protected String Genre;

}
