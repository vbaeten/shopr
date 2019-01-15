package com.realdolmen.shopr.domain;

import com.realdolmen.shopr.domain.enums.GameGenre;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@DiscriminatorValue("game")
@Data
public class Game extends Article{
    @Column
    @Size(max = 100)
    private String publisher;
    @Column
    private Long minimumAge;
    @Column
    @Enumerated(EnumType.STRING)
    private GameGenre gameGenre;

}
