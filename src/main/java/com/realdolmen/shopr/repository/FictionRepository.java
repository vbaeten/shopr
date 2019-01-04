package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Fiction;

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

    public Fiction findById(int id) {
        return entityManager.find(Fiction.class, id);
    }


    public void delete(Fiction toDeleteF) {
        this.entityManager.remove(entityManager.contains(toDeleteF) ? toDeleteF : entityManager.merge(toDeleteF));
    }

    public void update(Fiction fiction) {
        this.entityManager.merge(fiction);
    }

}
