package com.realdolmen.shopr.domain;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table
@NamedQueries(
        {
                @NamedQuery(
                        name = ShoppingCart.FIND_BY_USER,
                        query = "SELECT s FROM ShoppingCart s WHERE s.user = :user"
                ),
                @NamedQuery(
                        name = ShoppingCart.FIND_BY_USER_ID,
                        query = "SELECT s FROM ShoppingCart s WHERE s.user.id = :id"
                )
        }
)
public class ShoppingCart implements Serializable {

    public static final String FIND_BY_USER = "ShoppingCart.findByUser";
    public static final String FIND_BY_USER_ID = "ShoppingCart.findByUserID";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @MapsId
    @OneToOne
    private User user;

    @OneToMany
    private List<OrderLine> orderLines;

    public ShoppingCart() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public ShoppingCart(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }
}
