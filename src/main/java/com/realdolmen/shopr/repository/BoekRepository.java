package com.realdolmen.shopr.repository;


import com.realdolmen.shopr.domain.Boek;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class BoekRepository
{

    @PersistenceContext
    EntityManager entityManager;

    public List<Boek> findAllBooks()
    {
        return entityManager.createNamedQuery(Boek.FIND_ALL_BOOKS, Boek.class).getResultList();
    }


}
