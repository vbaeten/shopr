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
    @Column
    @Size(max = 100 )
    @NotNull
    private String title;
    @NotNull
    @Digits(integer=6, fraction=2)
    private BigDecimal price;
    @Column
    @Size(max = 100 )
    @NotNull
    private String supplierId;

    public Article() {
    }

    public Article(String title, BigDecimal price, String supplierId) {
        this.title = title;
        this.price = price;
        this.supplierId = supplierId;
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
