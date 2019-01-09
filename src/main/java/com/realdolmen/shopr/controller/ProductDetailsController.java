package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Product;
import com.realdolmen.shopr.service.ProductService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
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

    public void deleteProduct(Product product) {
        this.productService.delete(product);
    }

    public String goToEditPage() {
        return null;
    }

}
