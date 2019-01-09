package com.realdolmen.shopr.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "bestelling_lijn")
@NamedQueries(
        {
                @NamedQuery(
                        name = BestellingLijn.FIND_BY_ID,
                        query = "SELECT b FROM BestellingLijn b WHERE b.id = :id"
                ),
                @NamedQuery(
                        name = BestellingLijn.FIND_ALL,
                        query = "SELECT b FROM BestellingLijn b"
                ),
                @NamedQuery(
                        name = BestellingLijn.FIND_BY_BESTELLING_ID,
                        query = "SELECT b FROM BestellingLijn b WHERE b.bestelling.id = :id"
                )
        })
public class BestellingLijn {
    public static final String FIND_ALL = "BestellingLijn.findAll";
    public static final String FIND_BY_ID = "BestellingLijn.findById";
    public static final String FIND_BY_BESTELLING_ID = "BestellingLijn.findByBestellingId";

    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private Artikel artikel;

    @ManyToOne
    private Bestelling bestelling;

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "subtotal", updatable = false, insertable = false)
    private BigDecimal subTotal;




    public int getId() {
        return id;
    }

    public Artikel getArtikel() {
        return artikel;
    }

    public void setArtikel(Artikel artikel) {
        this.artikel = artikel;
    }

    public Bestelling getBestelling() {
        return bestelling;
    }

    public void setBestelling(Bestelling bestelling) {
        this.bestelling = bestelling;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }
}
