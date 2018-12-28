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
                )
        }
)
public class Bestelling {
    public static final String FIND_ALL = "Bestelling.findAll";
    public static final String FIND_BY_ID = "Bestelling.findById";

    @Id
    @GeneratedValue
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datum_van_bestelling")
    private Date datumVanBestelling;

    @ManyToMany
    private List<Artikel> artikels;

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
        return artikels;
    }

    public void setArtikels(List<Artikel> artikels) {
        this.artikels = artikels;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
