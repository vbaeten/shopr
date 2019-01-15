package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@DiscriminatorColumn(name = "types", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value = "")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries(
        {
                @NamedQuery(
                        name = Article.FIND_BY_TITLE,
                        query = "SELECT a FROM Article a WHERE a.title = :title"
                ),
                @NamedQuery(
                        name = Article.FIND_ALL,
                        query = "SELECT a FROM Article a order by a.title"
                ),
                @NamedQuery(
                        name = Article.FIND_MIN_PRICE,
                        query = "SELECT min(price) FROM Article a"
                ),
                @NamedQuery(
                        name = Article.FIND_MAX_PRICE,
                        query = "SELECT max(price) FROM Article a"
                )
        })
public class Article implements Serializable {
    public static final String FIND_BY_TITLE = "Article.findByTitle";
    public static final String FIND_ALL = "Article.findAll";
    public static final String FIND_MIN_PRICE = "SearchBean.findMinPrice";
    public static final String FIND_MAX_PRICE = "SearchBean.findMaxPrice";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    @Size(max=100)
    private String title;

    @NotNull
    @Digits(integer=6, fraction=2)
    private double price;

    @NotNull
    @Size(max=100)
    private String supplierId;

    public String getDisplayValue(){
        return "Article";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public boolean equals(Object o){
        try {
            Article a = (Article) o;
            return this.id == a.id;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}
