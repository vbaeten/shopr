package com.realdolmen.shopr.domain;


import javax.persistence.*;

@Entity
@Table(name="lp")
@NamedQueries({
        @NamedQuery(
                name = LP.FIND_ALL,
                query = "SELECT l FROM LP l"
        )

})
public class LP extends Article {


    public static final String FIND_ALL = "LP.findAll";

    @Id
    private int id;
    private String publisher;
    private LPGenre genre;




    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

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
