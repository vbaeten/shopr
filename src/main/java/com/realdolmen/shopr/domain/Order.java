package com.realdolmen.shopr.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
@NamedQueries(
        {
                @NamedQuery(
                        name = Order.FIND_ALL,
                        query = "SELECT o FROM Order o"
                ),
                @NamedQuery(
                        name = Order.FIND_BY_USER_ID,
                        query = "SELECT o FROM Order o WHERE o.user.id = :id"
                )
        }
)
public class Order implements Serializable {
    public static final String FIND_ALL = "Order.findAll";
    public static final String FIND_BY_ID = "Order.findById";
    public static final String FIND_BY_USER_ID = "Order.findByUserId";


    public Order() {
    }

    public Order(User user) {
        this.dateOfOrder = new java.sql.Date(System.currentTimeMillis());
        this.setUser(user);

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_of_order", updatable = false)
    private Date dateOfOrder;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private boolean confirmed;


    public int getOrderId() {
        return orderId;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }
}
