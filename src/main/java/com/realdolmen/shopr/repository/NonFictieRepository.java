package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.NonFictie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class NonFictieRepository
{
    @PersistenceContext
    private EntityManager entityManager;

    public NonFictie findById(int id) {
        return entityManager.find(NonFictie.class, id);
    }

    public List<NonFictie> findAllNonFictie()
    {
        return entityManager.createNamedQuery(NonFictie.FIND_ALL, NonFictie.class).getResultList();
    }

    public void insert(NonFictie nonFictie )
    {
        entityManager.persist(nonFictie);
    }

    public NonFictie findByName(String titel) {
        return entityManager.createNamedQuery(NonFictie.FIND_BY_NAME, NonFictie.class).setParameter("nonFictie", titel).getSingleResult();
    }

}
