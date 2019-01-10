package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "type")
public abstract class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ArticleId;
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
    @ManyToOne
    private Rating rating;
    @Column(insertable = false, updatable = false)
    private String type;

//    private Order order;

    public Article() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Article(String title, BigDecimal price, String supplierId, Rating rating) {
        this.title = title;
        this.price = price;
        this.supplierId = supplierId;
        this.rating = rating;
    }

    public Article(String title, BigDecimal price, String supplierId) {
        this.title = title;
        this.price = price;
        this.supplierId = supplierId;
    }

    public Long getArticleId() {
        return ArticleId;
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
