package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@MappedSuperclass
public class Book extends Article{
    @Column(length=100)
    private String author;
@Pattern(regexp="\\d{3}\\-\\d{2}\\-\\d{4}\\-\\d{3}\\-\\d")
    private String isbn;
    @Column
    private int numberOfPages;

}
