package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table
public class Rating {
    @Id
    @GeneratedValue
    private Long id;
    @Column
    @Min(0)
    @Max(10)
    private Integer score;

    @Column
    private String description;

   @ManyToOne
    private User user;

}
