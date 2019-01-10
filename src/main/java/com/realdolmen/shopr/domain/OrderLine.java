package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = OrderLine.FIND_ALL,
                        query = "SELECT ol FROM OrderLine ol"
                ),
                @NamedQuery(
                        name = OrderLine.FIND_ALL_BY_ORDER_ID,
                        query = "SELECT ol FROM OrderLine ol WHERE ol.order.id = :id"
                )
        }
)
@Table(name = "order_line")
public class OrderLine {
    public static final String FIND_ALL = "OrderLine.findAll";
    public static final String FIND_ALL_BY_ORDER_ID = "OrderLine.findAllByOrderId";

    @Id
    @GeneratedValue
    private Long id;
    private Integer amount;
    @ManyToOne
    private Item item;
    @ManyToOne
    private Order order;
    @Transient
    private Double orderLineTotalPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Double getOrderLineTotalPrice() {
        this.orderLineTotalPrice = this.getAmount() * this.getItem().getPrice();
        return orderLineTotalPrice;
    }

    public void setOrderLineTotalPrice(Double orderLineTotalPrice) {
        this.orderLineTotalPrice = orderLineTotalPrice;
    }
}