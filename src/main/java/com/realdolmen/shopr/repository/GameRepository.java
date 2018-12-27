package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.BookFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GameRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public BookFiction findById(int id) {
        return entityManager.find(BookFiction.class, id);
    }

    public List<BookFiction> findAll() {
        return entityManager.createQuery("select f from BookFiction f ", BookFiction.class).getResultList();
    }

    public BookFiction findByTitle(String title) {
        return entityManager.createQuery(" select f from BookFiction f where f.title =: title", BookFiction.class).getSingleResult();
    }

    public void insert(BookFiction bookFiction) {
        entityManager.persist(bookFiction);
    }
}
