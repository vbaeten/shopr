package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@MappedSuperclass
public abstract class Article {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "title")
    @Size(max = 100 )
    @NotNull
    private String title;
    @Column(name = "price")
    @NotNull
    @Digits(integer=6, fraction=2)
    private BigDecimal price;
    @Column(name = "supplier")
    @Size(max = 100 )
    @NotNull
    private String supplierId;
    @ManyToOne
    private Rating rating;

//    private Order order;

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
}
