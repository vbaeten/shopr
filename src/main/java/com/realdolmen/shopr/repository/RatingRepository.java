package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Artikel;
import com.realdolmen.shopr.domain.Beoordeling;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class RatingRepository
{
    @PersistenceContext
    private EntityManager entityManager;

public List<Beoordeling> findAllBeoordelingen()
{
    return entityManager.createNamedQuery(Beoordeling.FIND_ALL, Beoordeling.class).getResultList();
}

public List<Beoordeling> findBeoordelingenBepaaldArtikel(int id)
{
    return entityManager.createQuery("select b from Beoordeling b where Artikel.id = :id ").getResultList();
}

public void insert(Beoordeling beoordeling)
{
    entityManager.persist(beoordeling);
}
    public void update(Beoordeling b)
    {
        entityManager.merge(b);
    }
}
