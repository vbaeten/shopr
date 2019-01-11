package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "order_line")
@NamedQueries(
        {
                @NamedQuery(
                        name = OrderLine.FIND_ALL,
                        query = "SELECT o FROM OrderLine o"
                ),

                @NamedQuery(
                        name = OrderLine.FIND_BY_USER,
                        query = "Select o FROM OrderLine o WHERE o.user = :user"
                ),
                @NamedQuery(
                        name = OrderLine.FIND_BY_USER_ID,
                        query = "SELECT o FROM OrderLine o WHERE o.user.id = :id"
                )
        }
)
public class OrderLine {
    public static final String FIND_ALL = "OrderLine.findAll";
    public static final String FIND_BY_USER = "OrderLine.findByUser";
    public static final String FIND_BY_USER_ID = "OrderLine.findByUserId";

    @Id
    @GeneratedValue
    private int id;

    private int quantity;

    private double subTotal;

    @ManyToOne
    @JoinColumn(name="article_id")
    private Article article;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column
    private boolean ordered;


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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public boolean isOrdered() {
        return ordered;
    }

    public void setOrdered(boolean ordered) {
        this.ordered = ordered;
    }
}
