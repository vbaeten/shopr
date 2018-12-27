package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.NonFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class NonFictionRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public void insert(NonFiction newNonFiction) {
        entityManager.persist(newNonFiction);
    }

}
