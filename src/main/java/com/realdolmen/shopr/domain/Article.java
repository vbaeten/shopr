package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "article")
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "type")
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int articleId;

    @NotNull
    @Size(max = 100)
    @Column(name = "title")
    private String title;
    @NotNull
    @Digits(integer = 6, fraction = 2)
    @Column(name = "price")
    private BigDecimal price;
    @NotNull
    @Size(max = 100)
    @Column(name = "ID_supplier")
    private String supplierId;
    @Column(name = "type", insertable = false, updatable = false)
    private String type;



    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int id) {
        this.articleId = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
