package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class ProductRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Product findById(Long id) { return this.entityManager.find(Product.class, id); }

    public List<Product> findAll() {
        return this.entityManager.createQuery("select p from Product p", Product.class).getResultList();
    }

    public Product findByTitle(String title) {
        return this.entityManager.createQuery("select p from Product p where p.title = :title", Product.class).getSingleResult();
    }


    public List<Product> findByPrice(double price) {
        return this.entityManager.createQuery("select p from Product p where p.price = :price", Product.class).getResultList();
    }


    public Product findByProductType(String type) {
        return this.entityManager.createQuery("select p from Product p where p.productType = :type", Product.class).getSingleResult();
    }

    public List<String> findAllTypes() {
        return this.entityManager.createQuery("select distinct p.productType from Product p").getResultList();
    }


    public List<Product> findByRating(int rating) {
        return this.entityManager.createQuery("select p from Product p where p.ratings = :rating", Product.class).getResultList();
    }

    public void save(Product product) { this.entityManager.persist(product); }

    public void delete(Product product) { this.entityManager.remove(product); }

    public void deleteById(Long id) {
        this.entityManager.createQuery("delete FROM Product p where p.id = :id").executeUpdate();
    }
}
