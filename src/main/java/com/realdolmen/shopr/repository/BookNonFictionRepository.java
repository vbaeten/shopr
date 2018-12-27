package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.BookFiction;
import com.realdolmen.shopr.domain.BookNonFiction;
import com.realdolmen.shopr.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BookNonFictionRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public BookNonFiction findById(Long id) {
        return entityManager.find(BookNonFiction.class, id);
    }

    public List<BookNonFiction> findAll() {
        return entityManager.createQuery("select f from BookNonFiction f ", BookNonFiction.class).getResultList();
    }

    public BookNonFiction findByTitle(String title) {
        return entityManager.createQuery(" select f from BookNonFiction f where f.title =: title", BookNonFiction.class).getSingleResult();
    }

    public void insert(BookNonFiction bookNonFiction) {
        entityManager.persist(bookNonFiction);
    }
}

