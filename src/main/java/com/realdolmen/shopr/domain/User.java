package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

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
public class User {
    public static final String FIND_ALL = "User.findAll";
    public static final String FIND_BY_NAME = "User.findByName";

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "first_name")
    private String firstName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Rating> ratings;

    public User() {
    }

    public User(String name, String firstName) {
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

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Objects.equals(name, user.name) &&
                Objects.equals(firstName, user.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, firstName);
    }
}
