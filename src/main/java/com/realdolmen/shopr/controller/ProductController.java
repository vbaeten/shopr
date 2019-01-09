package com.realdolmen.shopr.controller;

import com.realdolmen.shopr.domain.Product;
import com.realdolmen.shopr.service.ProductService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Map;

@Named
@ViewScoped
public class ProductController {

    private Product newProduct;
    private List<Product> products;

    private Product selectedProduct;

    @Inject
    private ProductService productService;

    public Product getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(Product newProduct) {
        this.newProduct = newProduct;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return this.productService.findAll();
    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }

    public ProductService getProductService() {
        return productService;
    }

    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<String> getTypes() {
        return productService.findAllTypes();
    }


    public String goToDetail() {
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext externalContext = context.getExternalContext();
        Map<String, String> params = externalContext.getRequestParameterMap();
        return "productDetails.xhtml?faces-redirect=true&includeViewParams=true&id="+params.get("id");
    }

}
