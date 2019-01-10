package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "lp"/*, uniqueConstraints = @UniqueConstraint(columnNames = {"publisher", "title"})*/)
@DiscriminatorValue("lp")
@NamedQueries(
        {
                @NamedQuery(
                        name = Lp.FIND_BY_GENRE,
                        query = "SELECT l FROM Lp l WHERE l.lpGenre = :lpGenre"
                ),
                @NamedQuery(
                        name = Lp.FIND_ALL,
                        query = "SELECT l FROM Lp l"
                )
        }
)
public class Lp extends Article {
    public static final String FIND_ALL = "Lp.findAll";
    public static final String FIND_BY_GENRE = "Lp.findByGenre";

    @Size(max = 100)
    @Column(name = "publisher", unique = true)
    private String publisher;

    @Enumerated(EnumType.STRING)
    private LpGenre lpGenre;


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LpGenre getLpGenre() {
        return lpGenre;
    }

    public void setLpGenre(LpGenre lpGenre) {
        this.lpGenre = lpGenre;
    }
}
