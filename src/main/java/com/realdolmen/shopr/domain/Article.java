package com.realdolmen.shopr.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "type")
@Data
public abstract
class Article extends AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleId;
    @Column
    @Size(max = 100 )
    @NotNull
    private String title;
    @Column
    @NotNull
    @Digits(integer=6, fraction=2)
    private BigDecimal price;
    @Column
    @Size(max = 100 )
    @NotNull
    private String supplierId;

    @Column(insertable = false, updatable = false)
    private String type;

}
