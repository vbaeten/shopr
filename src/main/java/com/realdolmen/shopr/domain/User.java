package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "user")
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
public class User implements Serializable {
    public static final String FIND_ALL = "User.findAll";
    public static final String FIND_BY_NAME = "User.findByName";

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "first_name")
    @NotNull
    private String firstName;

    @OneToOne(mappedBy = "user")
    private ShoppingCart shoppingCart;

    public User() {
    }

    public User(int id, String name, String firstName) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
