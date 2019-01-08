package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "`order`")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "time_stamp")
    private Date timeStamp;
    @ManyToOne
    private User user;

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
}