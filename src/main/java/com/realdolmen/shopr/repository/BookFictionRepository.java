package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.BookFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class BookFictionRepository extends CrudRepository <BookFiction, Long>{
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    @Override
    EntityManager getEntityManager() {
        return entityManager;
    }

}
