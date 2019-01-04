package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.NonFiction;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class NonFictionRepository {

    @PersistenceContext
    private EntityManager entityManager;


    public void insert(NonFiction newNonFiction) {
        entityManager.persist(newNonFiction);
    }

    public List<NonFiction> findAllNonFictions() {

        return entityManager.createNamedQuery(NonFiction.FIND_ALL, NonFiction.class).getResultList();
    }
}

