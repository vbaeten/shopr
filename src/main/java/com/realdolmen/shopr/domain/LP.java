package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class LP extends Article {
    @Size(max = 100 )
    @Column
    private String artist;
    private LPMusicGenre LPMusicGenre;
}
