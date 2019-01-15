package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.LPMusicGenre;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("lp")
@Data
public class LP extends Article {
    @Size(max = 100)
    @Column
    private String artist;
    @Column
    @Enumerated(EnumType.STRING)
    private LPMusicGenre lPMusicGenre;
}
