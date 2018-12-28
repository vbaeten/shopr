package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Fictie;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


public class FictieRepository
{
    @PersistenceContext
    private EntityManager entityManager;

    public Fictie findById(int id) {
        return entityManager.find(Fictie.class, id);
    }

    public List<Fictie> findAllFictie()
    {
        return entityManager.createNamedQuery(Fictie.FIND_ALL, Fictie.class).getResultList();
    }

    public void insert(Fictie fictie )
    {
        entityManager.persist(fictie);
    }

    public Fictie findByName(String titel) {
        return entityManager.createNamedQuery(Fictie.FIND_BY_NAME, Fictie.class).setParameter("fictie", titel).getSingleResult();
    }

}
