package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "non_fiction")
@DiscriminatorValue("nonFiction")
@NamedQueries(
        {
                @NamedQuery(
                        name = NonFiction.FIND_BY_SUBJECT,
                        query = "SELECT n FROM NonFiction n WHERE n.nonFictionSubject = :nonFictionSubject"
                ),
                @NamedQuery(
                        name = NonFiction.FIND_ALL,
                        query = "SELECT n FROM NonFiction n"
                )
        }
)
public class NonFiction extends Book {
    public static final String FIND_ALL = "NonFiction.findAll";
    public static final String FIND_BY_SUBJECT = "NonFiction.findBySubject";

    @Enumerated(EnumType.STRING)
    @Column(name = "non_fiction_subject")
    private NonFictionSubject nonFictionSubject;


    public NonFictionSubject getNonFictionSubject() {
        return nonFictionSubject;
    }

    public void setNonFictionSubject(NonFictionSubject nonFictionSubject) {
        this.nonFictionSubject = nonFictionSubject;
    }
}
