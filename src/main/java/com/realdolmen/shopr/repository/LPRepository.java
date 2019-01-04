package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.LP;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LPRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<LP> findAllLps() {
        return entityManager.createNamedQuery(LP.FIND_ALL, LP.class).getResultList();

    }

    public void insert(LP lp) {

        entityManager.persist(lp);

    }

    public void delete(LP toDeleteLp) {
        this.entityManager.remove(entityManager.contains(toDeleteLp) ? toDeleteLp : entityManager.merge(toDeleteLp));
    }

    public LP findById(int id) {
        return entityManager.find(LP.class, id);
    }

    public void update(LP lp) {
        this.entityManager.merge(lp);
    }

}
