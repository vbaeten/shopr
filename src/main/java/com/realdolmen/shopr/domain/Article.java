package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

@DiscriminatorColumn(name = "type")
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = Article.FIND_BY_TITLE,
                        query = "SELECT a FROM Article a WHERE a.title = :title"
                ),
                @NamedQuery(
                        name = Article.FIND_ALL,
                        query = "SELECT a FROM Article a"
                )
        }
)
public abstract class Article implements Serializable {

    public static final String FIND_ALL = "Article.findAll";
    public static final String FIND_BY_TITLE = "Article.findByTitle";

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;


    @Column(name = "title")
    @Size(max = 100)
    @NotNull
    private String title;

    @NotNull
    @Digits(integer=6, fraction=2)
    @Column (name = "price")
    private double price;

    @NotNull
    @Size(max = 100)
    @Column(name = "supplier")
    private String supplier;

    @OneToMany
    @JoinColumn(name="article_ratings")
    @Transient
    private List<Rating> ratings;

    @Column(name="type", insertable = false, updatable = false)
    private String type;

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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


