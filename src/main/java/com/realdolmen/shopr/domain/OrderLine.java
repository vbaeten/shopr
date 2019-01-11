package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "order_Line")
@NamedQueries(
        {
                @NamedQuery(
                        name = OrderLine.FIND_BY_ID,
                        query = "SELECT b FROM OrderLine b WHERE b.id = :id"
                ),
                @NamedQuery(
                        name = OrderLine.FIND_ALL,
                        query = "SELECT b FROM OrderLine b"
                ),
                @NamedQuery(
                        name = OrderLine.FIND_BY_ORDER_ID,
                        query = "SELECT b FROM OrderLine b WHERE b.order.orderId = :id"
                )
        })
public class OrderLine implements Serializable {
    public static final String FIND_ALL = "OrderLine.findAll";
    public static final String FIND_BY_ID = "OrderLine.findById";
    public static final String FIND_BY_ORDER_ID = "OrderLine.findByOrderId";

    public OrderLine() {
    }

    public OrderLine(Article article, BigDecimal quantity, Order order) {
        this.article = article;
        this.quantity = quantity;
        this.order = order;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @ManyToOne
    @JoinColumn(name = "articleId", referencedColumnName = "articleId")
    private Article article;
    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "orderId")
    private Order order;

    @Transient
    private BigDecimal subTotal;


    public int getId() {
        return id;
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

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }
}
