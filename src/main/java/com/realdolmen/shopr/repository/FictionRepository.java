package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Fiction;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class FictionRepository {


    @PersistenceContext
    private EntityManager entityManager;


    public void insert(Fiction newFiction) {
        this.entityManager.persist(newFiction);
    }

    public List<Fiction> findAllFictions() {
        return entityManager.createNamedQuery(Fiction.FIND_ALL, Fiction.class).getResultList();
    }
}
