package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Lp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LpRepository {
    @PersistenceContext(unitName = "shoprPU")
    private EntityManager entityManager;

    public Lp findById(int id){ return entityManager.find(Lp.class, id); }

    public List<Lp> findAll() {
        return entityManager.createNamedQuery(Lp.FIND_ALL, Lp.class).getResultList();
    }
//TODO: name vervangen door title, ook in andere lagen
    public Lp findByName(String name) {
        return entityManager.createNamedQuery(Lp.FIND_BY_NAME, Lp.class).setParameter("name", name).getSingleResult();
    }

    public void insert(Lp lp) {
        entityManager.persist(lp);
    }

}
