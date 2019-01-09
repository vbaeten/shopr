package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "order_line")
public class OrderLine {

    @Id
    private int id;

    private int quantity;

    private double subTotal;

    @ManyToOne
    @JoinColumn(name="article_id")
    private Article article;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double calculateSubtotal() {
        return article.getPrice() * quantity;
    }


}
