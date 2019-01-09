package com.realdolmen.shopr.domain;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "bestelling")
@NamedQueries(
        {
                @NamedQuery(
                        name = Bestelling.FIND_BY_ID,
                        query = "SELECT b FROM Bestelling b WHERE b.id = :id"
                ),
                @NamedQuery(
                        name = Bestelling.FIND_ALL,
                        query = "SELECT b FROM Bestelling b"
                ),
                @NamedQuery(
                        name = Bestelling.FIND_BY_USER_ID,
                        query = "SELECT b FROM Bestelling b WHERE b.user.id = :id"
                )
        }
)
public class Bestelling {
    public static final String FIND_ALL = "Bestelling.findAll";
    public static final String FIND_BY_ID = "Bestelling.findById";
    public static final String FIND_BY_USER_ID = "Bestelling.findByUserId";

    @Id
    @GeneratedValue
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datum_van_bestelling")
    private Date datumVanBestelling;

    @ManyToMany
    private List<Artikel> Artikels;

    @ManyToOne
    private User user;



    public int getId() {
        return id;
    }

    public Date getDatumVanBestelling() {
        return datumVanBestelling;
    }

    public void setDatumVanBestelling(Date datumVanBestelling) {
        this.datumVanBestelling = datumVanBestelling;
    }

    public List<Artikel> getArtikels() {
        return Artikels;
    }

    public void setArtikels(List<Artikel> artikels) {
        Artikels = artikels;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
