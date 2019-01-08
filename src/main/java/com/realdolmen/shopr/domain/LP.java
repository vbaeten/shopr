package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "lp")
@DiscriminatorValue("lp")
@NamedQueries({
        @NamedQuery(
                name = LP.FIND_ALL,
                query = "SELECT l FROM LP l"
        )

})
public class LP extends Item {

    public static final String FIND_ALL = "LP.findAll";

    @Size(max=100)
    private String publisher;

    @Enumerated(EnumType.STRING)
    private LPGenre genre;


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LPGenre getGenre() {
        return genre;
    }

    public void setGenre(LPGenre genre) {
        this.genre = genre;
    }
}
