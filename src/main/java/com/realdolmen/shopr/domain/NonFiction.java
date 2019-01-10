package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("NON_FICTION")
@NamedQueries(
        {
                @NamedQuery(
                        name = NonFiction.FIND_BY_TITLE,
                        query = "SELECT n FROM NonFiction n WHERE n.title = :title"
                ),
                @NamedQuery(
                        name = NonFiction.FIND_ALL,
                        query = "SELECT n FROM NonFiction n order by n.title"
                )
        })
public class NonFiction extends Book {
    public static final String FIND_ALL = "NonFiction.findAll";
    public static final String FIND_BY_TITLE = "NonFiction.findByTitle";

    @Enumerated(EnumType.STRING)
    private NonFictionSubject subject;

    public NonFictionSubject getSubject() {
        return subject;
    }

    public void setSubject(NonFictionSubject subject) {
        this.subject = subject;
    }
}
