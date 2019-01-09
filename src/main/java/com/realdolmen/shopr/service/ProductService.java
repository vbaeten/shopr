package com.realdolmen.shopr.service;

import com.realdolmen.shopr.domain.Product;
import com.realdolmen.shopr.repository.ProductRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ProductService {

    @Inject
    private ProductRepository productRepository;

    public Product findById(Long id) { return productRepository.findById(id); }

    public List<Product> findAll() { return productRepository.findAll(); }

    public Product findByTitle(String title) { return productRepository.findByTitle(title); }

    public Product findByProductType(String type) { return productRepository.findByProductType(type); }

    public List<String> findAllTypes() { return productRepository.findAllTypes(); }

    public void save(Product product) { productRepository.save(product); }

    public void delete(Product product) { productRepository.delete(product); }

    public void deleteById(Long id) { productRepository.deleteById(id); }
}
