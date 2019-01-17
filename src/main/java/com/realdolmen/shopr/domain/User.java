package com.realdolmen.shopr.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
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
@Getter
@Setter
public class User

{
    public static final String FIND_ALL = "User.findAll";
    public static final String FIND_BY_NAME = "User.findByName";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "first_name")
    private String firstName;
    @Enumerated(EnumType.STRING)
    private EnumRoles role;
    @ManyToMany
    private List <Beoordeling> beoordelingen;

    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name="user_artikel",
//    joinColumns = @JoinColumn(name = "User_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "favorieten_id", referencedColumnName = "id"))
    public List<Artikel> favorieten;

    public User()
    {
    }

    public User(String name, String firstName)
    {
        this.name = name;
        this.firstName = firstName;
    }




    public void favorietToevoegenAanUser(Artikel a)
    {
        if (favorieten.contains(a)) {
            // Ignore add cause its already present in the list
        } else {
            favorieten.add(a);
        }

    }

    public void favorietVerwijderenUser(Artikel a)
    {
       favorieten.remove(a);

    }
}
