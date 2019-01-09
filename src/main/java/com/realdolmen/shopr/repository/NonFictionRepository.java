package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.NonFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class NonFictionRepository {

    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public NonFiction findById(Long id) { return entityManager.find(NonFiction.class, id); }

    public List<NonFiction> findAll() {
        return entityManager.createQuery("select n from NonFiction n", NonFiction.class).getResultList();
    }

    public void save(NonFiction nonFictionRepository) {
        entityManager.persist(nonFictionRepository);
    }

    public NonFiction findByTitle(String title) {
        return entityManager.createQuery("select f from Fiction f where f.title = :title", NonFiction.class).getSingleResult();
    }

    public NonFiction findByAuthor(String author) {
        return entityManager.createQuery("select f from Fiction f where f.author = :author", NonFiction.class).getSingleResult();
    }
}
