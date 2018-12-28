package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = Lp.FIND_ALL,
                        query = "SELECT l FROM Lp l"
                )
        }
)
@DiscriminatorValue("LP")
public class Lp extends Item {
    public static final String FIND_ALL = "Lp.findAll";

    private String artist;
    @Enumerated(EnumType.STRING)
    @Column(name = "lp_genre")
    private LpGenre lpGenre;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public LpGenre getLpGenre() {
        return lpGenre;
    }

    public void setLpGenre(LpGenre lpGenre) {
        this.lpGenre = lpGenre;
    }
}
