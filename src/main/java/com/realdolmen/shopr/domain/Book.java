package com.realdolmen.shopr.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public abstract class Book extends Article {
    @Column
    @Size(max = 100)
    private String author;
    @Column(unique = true)
    @Pattern(regexp = "\\d{3}\\-\\d{2}\\-\\d{4}\\-\\d{3}\\-\\d")
    @NotNull
    private String isbn;
    @Column
    private int numberOfPages;

}
