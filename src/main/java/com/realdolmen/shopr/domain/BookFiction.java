package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BookFiction extends Book {
    @Column
    private BookGenre bookGenre;
    @Column
    @Size(max = 255 )
    private String summary;
}
