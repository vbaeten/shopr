package com.realdolmen.shopr.domain;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "order")
@NamedQueries(
        {
                @NamedQuery(
                        name = Order.FIND_BY_ID,
                        query = "SELECT b FROM Order b WHERE b.id = :id"
                ),
                @NamedQuery(
                        name = Order.FIND_ALL,
                        query = "SELECT b FROM Order b"
                ),
                @NamedQuery(
                        name = Order.FIND_BY_USER_ID,
                        query = "SELECT b FROM Order b WHERE b.user.id = :id"
                )
        }
)
public class Order {
    public static final String FIND_ALL = "Order.findAll";
    public static final String FIND_BY_ID = "Order.findById";
    public static final String FIND_BY_USER_ID = "Order.findByUserId";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_of_order")
    private Date dateOfOrder;

    @OneToMany(mappedBy = "order")
    private List<OrderLine> orderLines;
    @ManyToOne
    private User user;


    public int getId() {
        return id;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLines(List<OrderLine> orderLines) {
        this.orderLines = orderLines;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
