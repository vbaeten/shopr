package com.realdolmen.shopr.domain;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table
@NamedQueries(
        {
                @NamedQuery(
                        name = User.FIND_BY_NAME,
                        query = "SELECT u FROM User u WHERE u.name = :name"
                ),
                @NamedQuery(
                        name = User.FIND_ALL,
                        query = "SELECT u FROM User u"
                )
        }
)
@Data
public class User extends AbstractEntity implements Serializable {
    public static final String FIND_ALL = "User.findAll";
    public static final String FIND_BY_NAME = "User.findByName";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    @Column(name = "name")
    private String name;
    @Column(name = "firstname")
    private String firstName;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getUserId() == user.getUserId() &&
                Objects.equals(getName(), user.getName()) &&
                Objects.equals(getFirstName(), user.getFirstName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getName(), getFirstName());
    }
}
