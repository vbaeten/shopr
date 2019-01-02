package com.realdolmen.shopr.domain;


import javax.persistence.*;

@Entity
@DiscriminatorValue("non fiction")
@NamedQueries({
        @NamedQuery(
                name = NonFiction.FIND_ALL,
                query = "SELECT nf FROM NonFiction nf"
        )
})
public class NonFiction extends Book{

    @Enumerated(EnumType.STRING)
    private Subject subject;
    public static final String FIND_ALL = "NonFiction.findAll";





    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
