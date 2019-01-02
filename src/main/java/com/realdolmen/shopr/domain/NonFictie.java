package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "non_fictie")
@DiscriminatorValue("nonFictie")
@NamedQueries(
        {
                @NamedQuery(
                        name = NonFictie.FIND_BY_SUBJECT,
                        query = "SELECT n FROM NonFictie n WHERE n.nonFictieOnderwerp = :nonFictieOnderwerp"
                ),
                @NamedQuery(
                        name = NonFictie.FIND_ALL,
                        query = "SELECT n FROM NonFictie n"
                )
        }
)
public class NonFictie extends Boek {
    public static final String FIND_ALL = "NonFictie.findAll";
    public static final String FIND_BY_SUBJECT = "NonFictie.findBySubject";

    @Enumerated(EnumType.STRING)
    private NonFictieOnderwerp nonFictieOnderwerp;

    public NonFictieOnderwerp getNonFictieOnderwerp() {
        return nonFictieOnderwerp;
    }

    public void setNonFictieOnderwerp(NonFictieOnderwerp nonFictieOnderwerp) {
        this.nonFictieOnderwerp = nonFictieOnderwerp;
    }
}
