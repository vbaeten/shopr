package com.realdolmen.shopr.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Article {

    @Id
    private int id;

    //TODO length 100, verplicht
    @Column(name = "title")
    private String title;

    //TODO type? 0,00
    @Column (name = "price")
    private int price;

    //TODO string, length 100. verplicht
    @Column(name = "supplier")
    private String supplier;

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

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}


