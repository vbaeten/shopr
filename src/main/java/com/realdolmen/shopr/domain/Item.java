package com.realdolmen.shopr.domain;


import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type")
@NamedQueries({
        @NamedQuery(
                name = Item.FIND_ALL,
                query = "SELECT i FROM Item i"
        )
})
public abstract class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public static final String FIND_ALL = "Item.findAll";

    @NotNull
    @Size(max=100)
    private String title;

    @Column(name = "type", insertable = false, updatable = false)
    private String type;

    @NotNull
    private double price;

    @Transient
    @Size(max=100)
    private String supplierId;


    @OneToMany(mappedBy = "item")
    @Transient
    private List <Review> reviews;



    public void getItemById(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        if(this.reviews == null) {
            this.reviews = new ArrayList<>();
        }
        this.reviews.add(review);
    }


}
