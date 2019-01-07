package com.realdolmen.shopr.repository;


import com.realdolmen.shopr.domain.Boek;
import com.realdolmen.shopr.domain.Game;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BoekRepository
{

    @PersistenceContext
    EntityManager entityManager;

    public Boek findById(int id) {
        return entityManager.find(Boek.class, id);
    }
    public List<Boek> findAllBooks()
    {
        return entityManager.createNamedQuery(Boek.FIND_ALL_BOOKS, Boek.class).getResultList();
    }

    public void update(Boek boek)
    {
        entityManager.merge(boek);
    }

    public void delete(Boek boek)
    {
        entityManager.remove(boek);
    }


}
