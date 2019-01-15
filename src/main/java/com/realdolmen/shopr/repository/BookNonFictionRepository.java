package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.BookNonFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BookNonFictionRepository extends CrudRepository<BookNonFiction, Long> {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }
}

