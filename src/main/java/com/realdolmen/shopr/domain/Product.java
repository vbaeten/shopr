package com.realdolmen.shopr.domain;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "product_type")
public abstract class Product {

    @Id
    @GeneratedValue
    private Long id;

//    @Column(length = 100, name = "title")
    private String title;

//    @Column(name = "price")
//    @NotNull
    private double price;

//    @Column(length = 100, name = "publisher")
    private String publisher;

//    @OneToMany(fetch = FetchType.EAGER)
//    private List<Rating> ratings;

    @Column(name = "product_type", insertable = false, updatable = false)
    private String productType;

//    public Product() {
//    }

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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
//
//    public List<Rating> getRatings() {
//        return ratings;
//    }
//
//    public void setRatings(List<Rating> ratings) {
//        this.ratings = ratings;
//    }


    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }
}
