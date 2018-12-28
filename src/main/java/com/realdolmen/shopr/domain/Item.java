package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@NamedQueries(
        {
                @NamedQuery(
                        name = Item.FIND_ALL,
                        query = "SELECT i FROM Item i"
                )
        }
)
@DiscriminatorColumn(name = "type")
@Inheritance(strategy = InheritanceType.JOINED)
public class Item {
    public static final String FIND_ALL = "Item.findAll";

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Double price;
    @Column(name = "type", insertable = false, updatable = false)
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }
}
