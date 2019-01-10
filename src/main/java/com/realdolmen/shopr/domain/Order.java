package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = Order.FIND_ALL_BY_USER_ID,
                        query = "SELECT o FROM Order o WHERE o.user.id = :id"
                )
        }
)
@Table(name = "`order`")
public class Order {
    public static final String FIND_ALL_BY_USER_ID = "Order.findOrdersByUserId";

    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "time_stamp")
    private Date timeStamp;
    @ManyToOne
    private User user;
    private Boolean confirmed = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }
}