package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    Article article;

    private int amount = 0;

    @Transient
    private double subTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getSubTotal() {
        this.setSubTotal();
        return subTotal;
    }

    public void setSubTotal() {
        this.subTotal = this.amount * this.article.getPrice();
    }
}
