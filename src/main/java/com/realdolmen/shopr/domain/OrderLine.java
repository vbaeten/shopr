package com.realdolmen.shopr.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Data
public class OrderLine extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderlineId;

    @ManyToOne
    private Article article;

    @ManyToOne
    private Order order;

    private BigDecimal subTotal;
    @Digits(integer = 6, fraction = 0)
    @NotNull
    private BigDecimal quantity;
    @Digits(integer = 6, fraction = 0)
    private BigDecimal totalPrice;

}
