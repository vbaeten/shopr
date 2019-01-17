package com.realdolmen.shopr.repository;

import com.realdolmen.shopr.domain.Beoordeling;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
        Query a = entityManager.createQuery("select b from Beoordeling b where b.artikel.id =:id ");
        a.setParameter("id", id);
        return a.getResultList();

    }

    public void insert(Beoordeling beoordeling)
    {
        entityManager.persist(beoordeling);
    }

    public void update(Beoordeling b)
    {
        entityManager.merge(b);
    }


    public void delete(Beoordeling b)
    {
        entityManager.remove(b);
    }

    public List<Beoordeling> findAllBeoordelingenByUser(int id)
    {
        Query q = entityManager.createQuery("select b from Beoordeling  b where b.user.id =:id");
        q.setParameter("id", id);
        return q.getResultList();
    }

    public List<Beoordeling> findAllBeoordelingenByArtikel(int id)
    {
        Query q = entityManager.createQuery("select b from Beoordeling  b where b.artikel.id =:id");
        q.setParameter("id", id);
        return q.getResultList();
    }

}
