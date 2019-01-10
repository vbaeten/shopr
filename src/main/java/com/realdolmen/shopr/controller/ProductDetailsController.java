package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Product;
import com.realdolmen.shopr.service.ProductService;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class ProductDetailsController {

    private Long id;
    private Product product;

    @Inject
    private ProductService productService;


    public void loadProduct() {
        product = productService.findById(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
