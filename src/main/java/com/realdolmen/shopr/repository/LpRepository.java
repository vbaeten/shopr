package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Lp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class LpRepository
{
@PersistenceContext
    private EntityManager entityManager;

    public Lp findById(int id) {
        return entityManager.find(Lp.class, id);
    }

    public List<Lp> findAllLps()
    {
        return entityManager.createNamedQuery(Lp.FIND_ALL, Lp.class).getResultList();
    }

    public void insert(Lp lp )
    {
        entityManager.persist(lp);
    }

    public Lp findByName(String titel) {
        return entityManager.createNamedQuery(Lp.FIND_BY_NAME, Lp.class).setParameter("lp", titel).getSingleResult();
    }

}