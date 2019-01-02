package com.realdolmen.shopr.domain;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "artikel")
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING, name = "type")
@NamedQueries(
        {
                @NamedQuery(
                        name = Artikel.FIND_BY_TITLE,
                        query = "SELECT a FROM Artikel a WHERE a.titel = :titel"
                ),
                @NamedQuery(
                        name = Artikel.FIND_ALL,
                        query = "SELECT a FROM Artikel a"
                )
        }
)
public class Artikel {
    public static final String FIND_ALL = "Artikel.findAll";
    public static final String FIND_BY_TITLE = "Artikel.findByTitle";

    @Id
    @GeneratedValue
    private int id;
    @NotNull
    @Size(max = 100)
    @Column(name = "titel")
    private String titel;
    @NotNull
    @Digits(integer=6, fraction=2)
    @Column(name = "prijs")
    private BigDecimal prijs;
    @NotNull
    @Size(max = 100)
    @Column(name = "ID_leverancier")
    private String idLeverancier;
    @Column(name ="type", insertable = false, updatable = false)
    private String type;

    @OneToMany
    private List<Beoordeling> beoordelingen;

    @ManyToMany
    private List<Bestelling> bestellingen;


    public int getId() {
        return id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }

    public void setPrijs(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public String getIdLeverancier() {
        return idLeverancier;
    }

    public void setIdLeverancier(String idLeverancier) {
        this.idLeverancier = idLeverancier;
    }

    public List<Beoordeling> getBeoordelingen() {
        return beoordelingen;
    }

    public void setBeoordelingen(List<Beoordeling> beoordelingen) {
        this.beoordelingen = beoordelingen;
    }

    public List<Bestelling> getBestellingen() {
        return bestellingen;
    }

    public void setBestellingen(List<Bestelling> bestellingen) {
        this.bestellingen = bestellingen;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
