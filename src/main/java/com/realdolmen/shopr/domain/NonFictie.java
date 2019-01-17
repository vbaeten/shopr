package com.realdolmen.shopr.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "nonFictie")
@NamedQueries({
        @NamedQuery(name = NonFictie.FIND_ALL,
                query = "select n from NonFictie n"),
        @NamedQuery(name= NonFictie.FIND_BY_NAME,
                query = "select n from NonFictie n where n.titel=:titel")})
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Data
public class NonFictie extends Boek
{

    public static final String FIND_ALL = "nonFictie.findAll";
    public static final String FIND_BY_NAME = "nonFictie.findByTitel";

    @Column
    @Enumerated(EnumType.STRING)
    EnumNonFictieGenre enumNonFictieGenre;




}
